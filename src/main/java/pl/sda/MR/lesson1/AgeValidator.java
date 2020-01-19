package pl.sda.MR.lesson1;

import java.time.LocalDate;

public class AgeValidator {

    public static boolean isAdult(Person person) {


        // Metoda sprawdzająca czy osoba jest dortosłym:
        // 1. Spr czy nie jest niepełnoletni na postawie daty urodzenia
        // 2. Spr czy jest pełnoletni ns podstawie Peselu, nawet jeżeli wg daty urodzenia jest pełnoletni ()ktoś wpisał fałszywą datę urodzenia
        // 3. Spr czy jest pełnoletni na podstawie daty urodzenia

        LocalDate today = LocalDate.now();
        LocalDate adultAgeBoundary = today.minusYears(18);      // od dzisiejszej daty -18 lat i spr. dzień graniczny
//1.
        if (person.getDateOfBirth().isAfter(adultAgeBoundary)) {  // spr. czy 18 lat od dziś jest większe od sprawdzanego wieku

            System.out.println("Person is not an adult");
            return false;
        }
//2.
        // spr czy dane z PESELU i wpisanej daty potwierdzjaą to samo
        // zamieniamy PESEL na date
        String peselNumber = person.getPeselNumber();
        LocalDate localDateFromPeselNumber;

        String yearAsString, monthAsString, dayAsString;
        yearAsString = peselNumber.substring(0, 2);
        monthAsString = peselNumber.substring(2, 4);
        dayAsString = peselNumber.substring(4, 6);

        Integer yearAsInt, monthAsInt, dayAsInt;
        yearAsInt = Integer.valueOf(yearAsString);
        monthAsInt = Integer.valueOf(monthAsString);
        dayAsInt = Integer.valueOf(dayAsString);

        if (monthAsInt > 12) {                          // dla urodzonych po roku 2000
            yearAsInt = yearAsInt + 2000;
            monthAsInt = monthAsInt - 20;
        } else {                                        // dla urodzonych przed rokiem 2000
            yearAsInt = yearAsInt + 1900;
        }
        localDateFromPeselNumber = LocalDate.of(yearAsInt, monthAsInt, dayAsInt);
        if (localDateFromPeselNumber.isAfter(adultAgeBoundary)) {
            System.out.println("fake PESEL number");
            return false;
        }
// 3.
        else {
            System.out.println("Person is an adult");
        }
        return true;
    }
}

