package example.rule1.code.sample1.before;

import java.time.LocalDate;

public class Billing {

    double winterRate;
    double summerRate;

    int quantity;
    int winterServiceCharge;

    public double calculate(LocalDate date) {
        double charge = 0;
        if (date.isBefore(SummerPeriod.SUMMER_START) || date.isAfter(SummerPeriod.SUMMER_END)) {
            charge = quantity * winterRate + winterServiceCharge;
        } else {
            charge = quantity * summerRate;
        }
        return charge;
    }

}
