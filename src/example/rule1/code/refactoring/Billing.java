package example.rule1.code.refactoring;

import java.time.LocalDate;

class Billing {

    double winterRate;
    double summerRate;

    int quantity;
    int winterServiceCharge;

    double calculate(LocalDate date) {
        if (SummerPeriod.isSummer(date)) return summerCharge();
        return winterCharge();
    }

    double winterCharge() {
        return quantity * winterRate + winterServiceCharge;
    }

    double summerCharge() {
        return quantity * summerRate;
    }

}
