package example.rule8.sample;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 予約カレンダー系のロジック
 * @author junya
 *
 */
public class CalendarLogic {

    @Binding(bindingType = BindingType.MUST)
    protected PlMBhvAp plMBhvAp;
    @Binding(bindingType = BindingType.MUST)
    protected FeePtnMBhvAp feePtnMBhvAp;
    @Binding(bindingType = BindingType.MUST)
    protected HldyMBhvAp hldyMBhvAp;
    @Binding(bindingType = BindingType.MUST)
    protected CalMBhvAp calMBhvAp;
    @Binding(bindingType = BindingType.MUST)
    protected PlanPaymentMethodService planPaymentMethodService;

    private boolean checkReservableRange = true;
    private boolean isDirect = false;

    @Resource
    protected CmpnLogic cmpnLogic;

    @Resource
    private ReserveCalendarRestService reserveCalendarRestService;

    public void setCheckReservableRange(boolean checkReservableRange) {
        this.checkReservableRange = checkReservableRange;
    }

    public void setDirect(){
        isDirect = true;
    }

    public Calendars getCalendarsWithStk(String ym, String today,
                                         final String plCd, Integer monthNum, final boolean excludeClosedCourse) {
        Calendars cal = getCalendars(ym, today, plCd, monthNum);
        if (ValidationUtils.isEmptyCollection(cal.monthList)) {
            return cal;
        }

        String startYmd = null;
        String endYmd = null;

        for (Month month : cal.monthList) {
            for (Week week : month.weekList) {
                for (Day day : week.dayList) {
                    if (!day.isOutmonth) {
                        endYmd = month.getYm()
                                + StringUtils.fillString(
                                String.valueOf(day.date), "L", 2, "0");

                        if (startYmd == null) {
                            startYmd = endYmd;
                        }
                    }
                }
            }
        }

		/*----------------------------------------*/

		/*
		 * 在庫設定情報の取得
		 *
		 *
		 * /*----------------------------------------
		 */
        RestCriteriaOfSingle criteria = RestCriteriaFactory.create(plCd, startYmd, endYmd);
        ReserveCalendar reserveCalendar = reserveCalendarRestService.listAll(criteria);

        Map<String, List<StockCalendar>> ymdStockCalendarlistMap = new LinkedHashMap<String, List<StockCalendar>>();
        Map<String, Price> ymdPriceMap = new HashMap<String, Price>();
        Map<String, Price> ymdPriceForHpMap = new HashMap<String, Price>();
        for(Condition condition : reserveCalendar.conditions()) {
            String ymd = condition.yearMonthDay().asText();

            ymdPriceMap.put(ymd, condition.price());
            ymdPriceForHpMap.put(ymd, condition.priceForHP());

            List<StockCalendar> stockCalList;
            if(ymdStockCalendarlistMap.containsKey(ymd)) {
                stockCalList = ymdStockCalendarlistMap.get(ymd);
            } else {
                stockCalList = new ArrayList<StockCalendar>();
            }

            for(com.asoview.model.api.reserve.calendar.course.Course course : condition.courses()) {
                //コースカレンダー
                StockCalendar stockCal = new StockCalendar();
                stockCal.setStkStKbn(course.stockStatus().getCode());
                stockCal.setStockQuantity(course.stock().value());
                stockCal.setStockUsedQuantity(course.reservedCount().value());

                //コース
                CourseGroup crsGrp = new CourseGroup();
                ArrayList<CrsM> crsMList = new ArrayList<CrsM>();
                CrsM crsM = new CrsM();
                crsM.setCrsNo(course.courseNumber().value());
                crsM.setCrsNm(course.name().value());
                crsMList.add(crsM);
                crsGrp.setCrsMList(crsMList);
                stockCal.setCourseGroup(crsGrp);

                stockCalList.add(stockCal);
                ymdStockCalendarlistMap.put(ymd, stockCalList);
            }
        }

        //決済方法の取得(クレジットカードを採用している場合は6ヶ月しかカレンダーを表示しない)
        List<PaymentMethod> paymentMethodList = planPaymentMethodService.getPaymentMethodList(plCd);
        String ymdAfterHalfYear = "";
        for(PaymentMethod paymentMethod : paymentMethodList) {
            if(paymentMethod.isCreditCard()) {
                Calendar calAfterHalfYear = new GregorianCalendar();
                calAfterHalfYear.add(Calendar.MONTH, 6);
                ymdAfterHalfYear = new SimpleDateFormat("yyyyMMdd").format(calAfterHalfYear.getTime());
                break;
            }
        }

        for (Month month : cal.monthList) {
            for (Week week : month.weekList) {
                for (Day day : week.dayList) {
                    if(DateUtils.compare(day.ymd, startYmd) >= 0 && DateUtils.compare(day.ymd, endYmd) <= 0) {
                        if(!StringUtils.isEmptyString(ymdAfterHalfYear) && DateUtils.compare(day.ymd, ymdAfterHalfYear) > 0) {
                            //クレジットカードを採用している場合は6ヶ月以降の日付は設定しない
                            continue;
                        }
                        // APIからの料金を設定する
                        if (isDirect) {
                            Price priceForHp = ymdPriceForHpMap.get(day.ymd);
                            if (priceForHp != null && !priceForHp.blank()) {
                                day.fee = StringUtils.formatNumber(priceForHp.value());
                            }
                        } else {
                            Price price = ymdPriceMap.get(day.ymd);
                            if (price != null && !price.blank()) {
                                day.fee = StringUtils.formatNumber(price.value());
                            }
                        }

                        List<StockCalendar> stockCalendarList = ymdStockCalendarlistMap.get(day.ymd);
                        if (!ValidationUtils.isEmptyCollection(stockCalendarList)) {
                            day.courseList = new ArrayList<Course>();
                            day.stockReservableStatus = Day.STK_RSVBL_ST_ALL;
                            boolean hasRequest = false;
                            boolean hasNg = false;
                            boolean hasOk = false;
                            boolean hasClose = false;
                            for (StockCalendar stockCalendar : stockCalendarList) {
                                Course course = new Course();
                                course.courseCalNo = stockCalendar.getStockCalendarNo();
                                course.courseName = stockCalendar.getCourseGroup().getCrsMList().get(0).getCrsNm();
                                course.stkStKbn = stockCalendar.getStkStKbn();
                                course.courseNo = stockCalendar.getCourseGroup().getCrsMList().get(0).getCrsNo();

                                RemainReserve remainReserve = RemainReserveFactory.create(stockCalendar, day.ymd);
                                course.hasRemainReserveNumber = remainReserve.isTarget();
                                course.remainReserveNumber = remainReserve.getRemainReserveNumber();

                                day.courseList.add(course);
                                if (stockCalendar.isStkStKbnRequest()) {
                                    hasRequest = true;
                                } else if (stockCalendar.isStkStKbnNg()) {
                                    hasNg = true;
                                } else if (stockCalendar.isStkStKbnClose()) {
                                    hasClose = true;
                                } else if (stockCalendar.isStkStKbnOk()) {
                                    hasOk = true;
                                }
                            }
                            day.isSingleCourseRemainReserve = false;
                            if(day.courseList.size() == 1) {
                                day.isSingleCourseRemainReserve = day.hasRemainReserve();
                                day.remainReserveNumber = day.remainReserveNumber();
                            }
                            if (hasOk) {
                                if (hasNg || hasRequest) {
                                    day.stockReservableStatus = Day.STK_RSVBL_ST_PRT;
                                } else {
                                    day.stockReservableStatus = Day.STK_RSVBL_ST_ALL;
                                }
                            } else {
                                if (hasClose && !hasRequest && !hasNg) {
                                    // 「開催なし」しかない場合はカレンダーグレイアウト
                                    day.stockReservableStatus = Day.STK_RSVBL_ST_NOT_SET;
                                } else if (hasRequest) {
                                    day.stockReservableStatus = Day.STK_RSVBL_ST_REQ;
                                } else {
                                    day.stockReservableStatus = Day.STK_RSVBL_ST_NONE;
                                }
                            }
                        } else {
                            day.stockReservableStatus = Day.STK_RSVBL_ST_NOT_SET;
                        }// if empty crsCalMList
                    }// if day.ymd >= startYmd && day.ymd <= endYmd
                }// loop day list
            }// loop week list
        }// loop month list

        return cal;
    }
}
