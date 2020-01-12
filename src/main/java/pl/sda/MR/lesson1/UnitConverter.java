package pl.sda.MR.lesson1;

public class UnitConverter {
    /*Zad 1. Stwórz nową klasę UnitConverter a w niej metodę pozwalającą na konwersję z stopni
    Celsjusza na Fahrenheita (celsiusToFahrenheit) przyjmującą jako argument liczbę
    będącą stopniami Celsjusza. Wzór to °F = (°C × 1.8) + 32. Następnie stwórz metodę
    pozwalającą na odwrotną konwersję.*/

    public static double celsiusToFahrenheit(double celsiusDegrees) {
        double farenheitDegrees = (celsiusDegrees * 1.8) + 32;
        System.out.println(celsiusDegrees + "\u00B0 " + "C to " + farenheitDegrees + "\u00B0 " + "F");
        return farenheitDegrees;
    }

    /*Zad 2. Stwórz metody konwertujące kilometry na mile (lądowe) i odwrotnie.*/

    public static double kilometersToMiles(double kilometersValue) {
        double milesValue = ((1 / 1.61) * kilometersValue);
        System.out.println(kilometersValue + "km = " + milesValue + "miles");
        return milesValue;
    }

    public static double milesToKilometers(double milesValue) {
        double kilometersValue = milesValue * 1.61;
        System.out.println(milesValue + "miles = " + kilometersValue + "km");
        return kilometersValue;
    }


    /*Stwórz metody konwertujące kilogramy na funty i odwrotnie.*/


    public static double kilosToPounds(double kilos) {
        double pounds = 2.20 * kilos;
        System.out.println(kilos + "kg =" + pounds + "lbs");
        return pounds;
    }

    public static double poundsToKilos(double pounds) {
        double kilos = pounds / 2.20;
        System.out.println(pounds + "lbs= " + kilos + "kg");
        return pounds;
    }

}
