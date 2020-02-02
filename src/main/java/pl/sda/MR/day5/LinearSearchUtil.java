package pl.sda.MR.day5;

public class LinearSearchUtil {

    public static int findFirstSoftDrink(SoftDrink[] tableOfSoftDrinks, SoftDrink searchedDrink) {
        int result = -1;
        for (int i = 0; i < tableOfSoftDrinks.length; i++) {

            if (tableOfSoftDrinks[i].equals(searchedDrink)) {
                result = i;
            }
        }
        return result;
    }


}

