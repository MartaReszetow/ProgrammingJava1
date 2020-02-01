package pl.sda.MR.day4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

//Stwórz klasę TimeCalculator. Stwórz w niej metodę daysToChristmasEve() wyświetlają informację w konsoli z komunikatem:
// "It's just [ilość dni]to Christmas Eve!". Jeżeli pozostało mniej jak 60 dni dodaj w nowej linii "Time to buy gifts".
// Metoda ta niech woła kolejną metode daysToChristmasEve(LocalDate now) do której przekażemy aktualną datę na podstawie
// której zwróci wartość liczbową ilości dni pozostałych do najbliższej Wigilii świąt Bożego Narodzenia.
// Spraw aby metoda była uniwersalna - jak najbliższe święta miną, powinna nadal działać. Pamiętaj również o końcówce roku.
// Użyj klasy LocalDate i jej metody now(). Dwie różne daty możesz porównać poprzez ChronoUnit.DAYS.between().
// Przetestuj też z metody main samą metodę daysToChristmasEve przekazując jej różne daty i drukując wynik.
public class TimeCalculator {

    // method that compares today with next
    public static void daysToChristmasEve(LocalDate today) {

        LocalDate dayOfChristmasEve = LocalDate.of(today.getYear(), 12, 24);  // date of Christmas Eve for current year
        int daysToChristmas = dayOfChristmasEve.getDayOfYear() - today.getDayOfYear();

        if (daysToChristmas < 0) {
            LocalDate futureChristmas = LocalDate.of((today.getYear() + 1), 12, 24);
            LocalDate NewYearsDate = LocalDate.of(today.getYear(), 12, 31);
            daysToChristmas = NewYearsDate.getDayOfYear() - today.getDayOfYear() + futureChristmas.getDayOfYear() + 1;
            System.out.println("It's just " + daysToChristmas + " to Christmas Eve");
        }
        if (daysToChristmas == 0) {
            System.out.println("Its Christmas Eve !!!!");
        } else
            System.out.println("It's just " + daysToChristmas + " to Christmas Eve");

        if (daysToChristmas < 60) {
            System.out.println("Time to but gifts!");
        }
    }

    public static void daysToChristmasEveInfo() {
        LocalDate today = LocalDate.now();
        daysToChristmasEve(today);
    }


    // Stwórz w TimeCalculator metodę minutesToEndOfClass().
    // Jej celem będzie wydrukowanie wiadomości "There is [ilość minut] minutes left to the end of today class".
    // Postaraj się zainspirować poprzednim zadaniem. Użyj jednak tym razem klasy LocalTime.
    // Następnie dodaj pętlę do while która będzie działała dopóki wartość ta nie będzie wynosić 0, dodaj też w tej pętli
    // Thread.sleep(5000) aby obliczenia i drukowanie były co 5 sekund.


    public static void minutesToEndOfClass() throws InterruptedException {
        long timeToEndOfClass;
        LocalTime endOfClass = LocalTime.of(16, 00);
        do {
            LocalTime presentTime = LocalTime.now();
            timeToEndOfClass = ChronoUnit.MINUTES.between(presentTime, endOfClass);
            System.out.println("There is " + timeToEndOfClass + " minutes left to the end of today class");
            Thread.sleep(60000);
        }
        while (timeToEndOfClass >= 0);
    }






}



