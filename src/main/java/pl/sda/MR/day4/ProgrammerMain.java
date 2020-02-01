package pl.sda.MR.day4;

import java.util.ArrayList;
import java.util.List;

public class ProgrammerMain {
    public static void main(String[] args) {

// Stwórz enum gender z trzema płciami: men, women, other.
//Stwórz klasę Programmer. Powinna zawierać pola: id, firstName, lastName, gender(enum), alive(boolean).
//Stwórz List<Programmer> w metodzie main. Dodaj do niej 8 nowych instacji Programmer.
// Stwórz nową klasę LifeSimulator z publiczną metodą simulate() przyjmującą List<Programmer>
// oraz ilość dni do zasymulowania. Utwórz w niej kolejne metody prywatne work() play() rest()
// przyjmujące pojedyńczą instancję klasy Programmer, ale tylko kiedy są żywi.
//Metoda work powinna drukować: Programmer.getName()+ is working
//oraz mieć 1% szansy na spowodowanie zgonu czyli ustawienie alive na false.
//Metoda play powinna drukować: Programmer.getName()+ is having fun
//oraz mieć 2% szansy na spowodowanie zgonu czyli ustawienie alive na false.
//Metoda rest powinna drukować: Programmer.getName()+ is resting
//oraz mieć 0,3% szansy na spowodowanie zgonu czyli ustawienie alive na false.
//Przekaż listę z metody main do LifeSimulator.simulate testując różną ilość dni.
// Następnie przygotuj dwa sety Set<Programmer> - aliveProgrammerSet i notAliceProgrammerSet.
// Przetwórz wszystkich programistów na liście dzieląc ich na żywych i nieżywych.
//Wydrukuj wyniki z obu setów. Kogo dopadł koronawirus?


        List<Programmer> listOfProgrammers = new ArrayList<>();
        listOfProgrammers.add(new Programmer(100001, "Jan", "Kowalski", Gender.MEN));
        listOfProgrammers.add(new Programmer(100002, "Aleksander", "Lis", Gender.WOMEN));
        listOfProgrammers.add(new Programmer(100003, "Ola", "Igi", Gender.WOMEN));
        listOfProgrammers.add(new Programmer(100004, "Marysia", "Kowalska", Gender.OTHER));
        listOfProgrammers.add(new Programmer(100005, "Kuba", "Kot", Gender.MEN));
        listOfProgrammers.add(new Programmer(100006, "Olga", "Zbych", Gender.WOMEN));
        listOfProgrammers.add(new Programmer(100007, "Stanislaw", "Dawidowski", Gender.MEN));
        listOfProgrammers.add(new Programmer(100008, "Dzban", "Lisewski", Gender.OTHER));


        LifeSimulator.Simulate(listOfProgrammers,5);

    }
}
