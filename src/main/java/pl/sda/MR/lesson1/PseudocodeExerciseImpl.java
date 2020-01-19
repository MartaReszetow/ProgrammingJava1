package pl.sda.MR.lesson1;

public class PseudocodeExerciseImpl {


    public static int maxValueFinder(int table[]) {
        int maxValue = table[0];
        for (int i = 0; i < table.length; i++) {
            if (maxValue < table[i]) {
                maxValue = table[i];
            }
        }
        return maxValue;
    }

    // Zad dom 2) Sprawdzająca czy wszystkie liczby są parzyste i zwracająca boolean’a.
    //3) Sumująca tylko liczby dodatnie.


    public static boolean evenNumbersChecher(int table[]) {
        boolean result = false;
        for (int i = 0; i < table.length; i++) {
            if (table[i] % 2 == 0) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }







}
