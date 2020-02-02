package pl.sda.MR.day5;

import java.util.Arrays;
import java.util.List;

public class MainAppSoftDrinks {
    public static void main(String[] args) {

        SoftDrink drink1 = new SoftDrink("Coke", "Cocacola company", 3.75);
        SoftDrink drink2 = new SoftDrink("Sprite", "Cocacola company", 3.75);
        SoftDrink drink3 = new SoftDrink("Fanta", "Cocacola company", 3.90);
        SoftDrink drink4 = new SoftDrink("Water Muszyna", "Muszyna", 2.30);
        SoftDrink drink5 = new SoftDrink("Coconut Water", "Lidl", 5.75);
        SoftDrink drink6 = new SoftDrink("Orange juice", "Lidl", 3.20);


        SoftDrink [] tableOfDrinks = {drink1,drink2,drink3,drink4,drink5,drink6};

        SoftDrink searchedDrink = new SoftDrink("Coconut Water", "Lidl", 5.75);

        int index = LinearSearchUtil.findFirstSoftDrink(tableOfDrinks, searchedDrink);
        System.out.println("Searched drink is on the " +index +" position");
    }
}
