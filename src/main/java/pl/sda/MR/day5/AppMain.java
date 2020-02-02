package pl.sda.MR.day5;

import pl.sda.MR.lesson1.Person;

import java.time.LocalDate;
import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {

// ZAD2
        Person personOne = new Person("John", "Smith", "123", LocalDate.of(1987, 12, 1));
        Person personTwo = new Person("Ann", "Smith", "324", LocalDate.of(2002, 6, 28));
        Person personThree = new Person("Zusa", "Args", "444", LocalDate.of(1985, 5, 11));
        Person personFourth = new Person("Caroline", "Koy", "432", LocalDate.of(1988, 1, 1));
        Person personFive = new Person("Abdullah", "Ali", "256", LocalDate.of(1958, 1, 12));
        Person personSix = new Person("Big", "O", "521", LocalDate.of(1984, 1, 15));
        Person personSeven = new Person("Gertruda", "Shmidt", "332", LocalDate.of(2000, 1, 1));

        Person[] people = {personOne, personTwo, personThree, personFourth, personFive, personSix, personSeven};


        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

// ZAD1
        int[] arrOne = {7, 2, 1, 6, 8, 5, 3, 4};
        int[] arrTwo = {7, 5, 2, 235, 651, 9, 6, 8, 6};
        System.out.println("arrOne: ");
        System.out.println(Arrays.toString(arrOne));
        //   QuickSort.sort(arrOne);
        Arrays.sort(arrOne);
        System.out.println(Arrays.toString(arrOne));
        //  System.out.println(Arrays.toString(arrOne));
        System.out.println("arrTwo: ");
        System.out.println(Arrays.toString(arrTwo));
        //  QuickSort.sort(arrTwo);
        Arrays.sort(arrTwo);
        System.out.println(Arrays.toString(arrTwo));


    }
}
