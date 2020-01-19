package pl.sda.MR.lesson1;

public class Factorial {

    public static long calculateFactorial(long a) {
        if (a == 1) {
            return 1;
        }
        return a * calculateFactorial(a - 1);

    }

}
