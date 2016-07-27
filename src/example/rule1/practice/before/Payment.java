package example.rule1.practice.before;

import java.time.LocalDate;

public class Payment {

    double summerRate;
    double winterRate;

    int quantity;
    int summerServiceCharge;

    public double calculate(LocalDate date) {
        double charge = 0;
        if (date.isBefore(WinterPeriod.WINTER_START) || date.isAfter(WinterPeriod.WINTER_END)) {
            charge = quantity * summerRate + summerServiceCharge;
        } else {
            charge = quantity * winterRate;
        }
        return charge;
    }

}
