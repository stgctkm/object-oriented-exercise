package example.rule1.code.refactoring;

import java.time.LocalDate;

class SummerPeriod {
    static LocalDate SUMMER_START = LocalDate.of(2016, 7, 1);
    static LocalDate SUMMER_END = LocalDate.of(2016, 9, 30);

    static boolean isSummer(LocalDate date) {
        if (date.isEqual(SUMMER_START)) return true;
        if (date.isEqual(SUMMER_END)) return true;
        return date.isAfter(SUMMER_START) && date.isBefore(SUMMER_END);
    }
}
