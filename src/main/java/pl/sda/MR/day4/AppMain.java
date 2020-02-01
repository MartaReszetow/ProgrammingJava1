package pl.sda.MR.day4;

import java.time.LocalDate;

public class AppMain {
    public static void main(String[] args) throws InterruptedException {
      /*  // test for other dates
        TimeCalculator.daysToChristmasEve(LocalDate.of(2020, 12, 23));
        TimeCalculator.daysToChristmasEve(LocalDate.of(2021, 12, 24));
        TimeCalculator.daysToChristmasEve(LocalDate.of(2022, 12, 25));
        // test for today
        TimeCalculator.daysToChristmasEveInfo();

        TimeCalculator.minutesToEndOfClass();*/

        // __________________MYQUEUE___________________
        // tak strworzyliśmy obiekt, którego typu wcześneij nie deklarowaiśmy

        MyQueue<String> myStringQueue = new MyQueue<>();

        myStringQueue.offer("Hello world");
        myStringQueue.offer("lalalla1");
        myStringQueue.offer("lalalla2");
        myStringQueue.offer("lalalla3");
        myStringQueue.printAll();
        System.out.println("Object to be removed: " + myStringQueue.pool());
        myStringQueue.printAll();


        MyQueue<Integer> myIntegerQueue = new MyQueue<>();
        myIntegerQueue.offer(256);

    }
}
