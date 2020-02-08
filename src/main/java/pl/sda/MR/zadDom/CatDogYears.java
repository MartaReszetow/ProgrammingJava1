package pl.sda.MR.zadDom;

import java.util.Arrays;

public class CatDogYears {
    public static void main(String[] args) {
        int[] result = humanYearsCatYearsDogYears(27);
        System.out.println("Human years, cat years, dog years: " + Arrays.toString(result));
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        if (humanYears >= 1) {
            int catYears = 15;
            int dogYears = 15;

            if (humanYears >= 2) {
                catYears = catYears + 9;
                dogYears = dogYears + 9;
                if (humanYears >= 3) {
                    catYears = catYears + 4 * (humanYears - 2);
                    dogYears = dogYears + 5 * (humanYears - 2);
                }
            }
            return new int[]{humanYears, dogYears, catYears};
        } else
            return new int[0];
    }
}
