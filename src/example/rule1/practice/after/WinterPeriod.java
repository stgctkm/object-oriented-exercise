package example.rule1.practice.after;

import java.time.LocalDate;

class WinterPeriod {
    static LocalDate WINTER_START = LocalDate.of(2016, 12, 1);
    static LocalDate WINTER_END = LocalDate.of(2017, 2, 28);

    static boolean isWinter(LocalDate date) {
        if (date.isEqual(WINTER_START)) return true;
        if (date.isEqual(WINTER_END)) return true;
        return date.isAfter(WINTER_START) && date.isBefore(WINTER_END);
    }
}
