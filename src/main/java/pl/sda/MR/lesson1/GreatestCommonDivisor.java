package pl.sda.MR.lesson1;

public class GreatestCommonDivisor {

    // Utwórz nową klasę i napisz w niej metodę ustalającą największy wspólny
    //dzielnik (GCD – greatest common divisor) dla dwóch podanych liczb.
    //Spróbuj najpierw podejścia iteracyjnego, następnie przerób je na
    //rekurencyjne.

    public static int findGCD(int a, int b) {  // metoda "siłowa"
        int nwd = 0;
        for (int i = 1; i <= b; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                nwd = i;
            }
        }
        return nwd;
    }

    // rekurencja - algorytm Euklidesa
    public static int recursionFindGCD(int a, int b) {

        if (b == 0) {
            return a;
        }
        {
         return recursionFindGCD(b, a%b);
        }

    }
}
