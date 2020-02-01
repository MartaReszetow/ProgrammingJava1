package pl.sda.MR.day4;

import java.time.LocalDate;

public class AppMain {
    public static void main(String[] args) {
        // test for other dates
        TimeCalculator.daysToChristmasEve(LocalDate.of(2020, 12, 23));
        TimeCalculator.daysToChristmasEve(LocalDate.of(2021, 12, 24));
        TimeCalculator.daysToChristmasEve(LocalDate.of(2022, 12, 25));
        // test for today
        TimeCalculator.daysToChristmasEveInfo();
    }
}
