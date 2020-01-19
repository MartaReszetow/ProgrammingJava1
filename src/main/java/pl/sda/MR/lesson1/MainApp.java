package pl.sda.MR.lesson1;

public class MainApp {
    public static void main(String[] args) {

        //____  UnitConverter ____
        //  UnitConverter.celsiusToFahrenheit(12);
        //  UnitConverter.kilometersToMiles(12);
        //  UnitConverter.milesToKilometers(12);
        //  UnitConverter.kilosToPounds(12);
        //  UnitConverter.poundsToKilos(12);

        // ___AgeValicator___
//        Person person = new Person("Jan", "Kowalski", "98021446813", LocalDate.of(1989,02,01));
//        Person underagePerson = new Person("Brajan", "Kowalski", "10221487111", LocalDate.of(2010,02,01));
//        Person fakeDataPerson = new Person("Brajanek", "Kowalski", "10221487111", LocalDate.of(1989,02,01));
//
//        System.out.println(AgeValidator.isAdult(person));
//        System.out.println(AgeValidator.isAdult(underagePerson));
//        System.out.println(AgeValidator.isAdult(fakeDataPerson));


        //_____rekurencja = GreatestCommonDivisor______

//        int [] table={5,2,5,100,-200,-5,0,3};
//        System.out.println("max value:" + PseudocodeExerciseImpl.maxValueFinder(table));
//        System.out.println("all numbers are even: "+PseudocodeExerciseImpl.evenNumbersChecher(table));
//        System.out.println("NWD: "+ GreatestCommonDivisor.findGCD(70,60));
//        System.out.println("NWD (rekurencyjne): "+ GreatestCommonDivisor.recursionFindGCD(60,70));


        //_______silnia=Factorial_______

        //       System.out.println("silnia: " + Factorial.calculateFactorial(12));

//        String first = "Hi, I'm first!";
//        String second = "Hi, I'm second!";
//        String third = "Hi, I'm third!";
//        StackImp stack = new StackImp();
//
//        stack.push(first);
//        stack.push(second);
//        stack.push(third);
//
//        Object peekResult = stack.peek();
//        System.out.println((String) peekResult);
//
//        Object popResult = stack.pop();
//        Object popResultTwo = stack.pop();
//
//        System.out.println((String)popResult);
//        System.out.println((String)popResultTwo);
//
//        // + dodać warunek że jeżeli indeks wynosi 0 to zwraca nulla


        //_______node-LinkedList_______________

        MyLinkedList list = new MyLinkedList();
        list.add(20);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);

       list.printAll();



    }
}
