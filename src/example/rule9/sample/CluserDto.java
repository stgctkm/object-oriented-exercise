package example.rule9.sample;

import java.io.Serializable;


@Component(instance = InstanceType.REQUEST)
public class CluserDto implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public boolean isTester;
    public Integer userId;
    public Long fbId;
    public String lastName;
    public String lastNameKana;
    public String firstName;
    public String firstNameKana;
    public String picture;
    public String name;
    public String fbAccessToken;
    public String backUrl;
    public String mail;
    public String birthYear;
    public String birthMonth;
    public String birthDay;
    public String tel1;
    public String tel2;
    public String tel3;
    public String postCode1;
    public String postCode2;
    public String prefectureName;
    public String prefectureCode;
    public String address;
    public boolean newsLetter;
    public String gender;
    public String eMail;
    public String bnstSid;
    public String bnstCid;
    public String lName;
    public String lNameKana;
    public String fName;
    public String fNameKana;
    public String passwd;
    public String mid;
    public String affCd;
    public String notChgPsswdFlg;

    public void setData(UsrM usrM){
        userId = usrM.getUsrId();
        fbId = usrM.getFbUsrId();
        name = usrM.getName();
        address = usrM.getAddr();
        gender = usrM.getGndrKbn();
        picture = usrM.getUsrImg();
        firstName = usrM.getFNm();
        lastName = usrM.getLNm();
        firstNameKana = usrM.getFNmKn();
        lastNameKana = usrM.getLNmKn();
        birthYear = String.valueOf(usrM.getBtY());
        birthMonth = String.valueOf(usrM.getBtM());
        birthDay = String.valueOf(usrM.getBtD());
        tel1 = usrM.getTel1();
        tel2 = usrM.getTel2();
        tel3 = usrM.getTel3();
        postCode1 = usrM.getPostCd1();
        postCode2 = usrM.getPostCd2();
        prefectureCode = usrM.getPrefCd();
        newsLetter = CommonConstIf.FLG_ON.equals(usrM.getMlRcvFlg()) ? true : false;
        notChgPsswdFlg = CommonConstIf.FLG_ON.equals(usrM.getNotChgPsswdFlg()) ? CommonConstIf.FLG_ON : CommonConstIf.FLG_OFF;
        mail = usrM.getEMail();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getFbId() {
        return fbId;
    }

    public void setFbId(Long fbId) {
        this.fbId = fbId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastNameKana() {
        return lastNameKana;
    }

    public void setLastNameKana(String lastNameKana) {
        this.lastNameKana = lastNameKana;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstNameKana() {
        return firstNameKana;
    }

    public void setFirstNameKana(String firstNameKana) {
        this.firstNameKana = firstNameKana;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFbAccessToken() {
        return fbAccessToken;
    }

    public void setFbAccessToken(String fbAccessToken) {
        this.fbAccessToken = fbAccessToken;
    }

    public String getBackUrl() {
        return backUrl;
    }

    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getTel3() {
        return tel3;
    }

    public void setTel3(String tel3) {
        this.tel3 = tel3;
    }

    public String getPostCode1() {
        return postCode1;
    }

    public void setPostCode1(String postCode1) {
        this.postCode1 = postCode1;
    }

    public String getPostCode2() {
        return postCode2;
    }

    public void setPostCode2(String postCode2) {
        this.postCode2 = postCode2;
    }

    public String getPrefectureName() {
        return prefectureName;
    }

    public void setPrefectureName(String prefectureName) {
        this.prefectureName = prefectureName;
    }

    public String getPrefectureCode() {
        return prefectureCode;
    }

    public void setPrefectureCode(String prefectureCode) {
        this.prefectureCode = prefectureCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isNewsLetter() {
        return newsLetter;
    }

    public void setNewsLetter(boolean newsLetter) {
        this.newsLetter = newsLetter;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getBnstSid() {
        return bnstSid;
    }

    public void setBnstSid(String bnstSid) {
        this.bnstSid = bnstSid;
    }

    public String getBnstCid() {
        return bnstCid;
    }

    public void setBnstCid(String bnstCid) {
        this.bnstCid = bnstCid;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlNameKana() {
        return lNameKana;
    }

    public void setlNameKana(String lNameKana) {
        this.lNameKana = lNameKana;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfNameKana() {
        return fNameKana;
    }

    public void setfNameKana(String fNameKana) {
        this.fNameKana = fNameKana;
    }
    public String getNotChgPsswdFlg() {
        return notChgPsswdFlg;
    }

    public void setNotChgPsswdFlg(String notChgPsswdFlg) {
        this.notChgPsswdFlg = notChgPsswdFlg;
    }



}


