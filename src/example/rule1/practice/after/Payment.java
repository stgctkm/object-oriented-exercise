package example.rule1.practice.after;

import java.time.LocalDate;

public class Payment {

    double summerRate;
    double winterRate;

    int quantity;
    int summerServiceCharge;

    double calculate(LocalDate date) {
        if (WinterPeriod.isWinter(date)) return winterCharge();
        return summerCharge();
    }

    double summerCharge() {
        return quantity * summerRate + summerServiceCharge;
    }

    double winterCharge() {
        return quantity * winterRate;
    }

}
