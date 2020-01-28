package pl.sda.MR.zadDom;

public class ATM {
    public static void main(String[] args) {
      Solve(1501);

    }

    public static int Solve(int n) {
        int solve = -1;

        if ((n % 10 == 0) && (n >= 1) && (n <= 1500)) {     //1380

            int bankNote500 = (n - n % 500) / 500;      // (1380-380)/500 = 1000/500=2
            int bankNote200 = ((n - 500 * bankNote500) - (n - 500 * bankNote500) % 200) / 200;     // (380-180)/200=1
            int bankNote100 = ((n - 500 * bankNote500 - 200 * bankNote200) - (n - 500 * bankNote500 - 200 * bankNote200) % 100) / 100;//(180-80)/100
            int bankNote50 = ((n - 500 * bankNote500 - 200 * bankNote200 - 100 * bankNote100) - (n - 500 * bankNote500 - 200 * bankNote200 - 100 * bankNote100) % 50) / 50;
            int bankNote20 = ((n - 500 * bankNote500 - 200 * bankNote200 - 100 * bankNote100 - 50 * bankNote50) - (n - 500 * bankNote500 - 200 * bankNote200 - 100 * bankNote100 - 50 * bankNote50) % 20) / 20;
            int bankNote10 = ((n - 500 * bankNote500 - 200 * bankNote200 - 100 * bankNote100 - 50 * bankNote50 - 20 * bankNote20) - (n - 500 * bankNote500 - 200 * bankNote200 - 100 * bankNote100 - 50 * bankNote50 - 20 * bankNote20) % 10) / 10;


            System.out.println("ATM will reply You the notes:" +
                    bankNote500 + " x 500$ " +
                    bankNote200 + " x 200$ " +
                    bankNote100 + " x 100$ " +
                    bankNote50 + " x 50$ " +
                    bankNote20 + " x 20$ " +
                    bankNote10 + " x 10$ "
            );

            solve = bankNote10 + bankNote20 + bankNote50 + bankNote100 + bankNote200 + bankNote500;
        } else {
            System.out.println("Its impossible to reply amount of money You've ordered");
        }
        System.out.println(solve);
        return solve;

    }

}

