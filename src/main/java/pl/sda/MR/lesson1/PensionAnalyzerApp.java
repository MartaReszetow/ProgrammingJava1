package pl.sda.MR.lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PensionAnalyzerApp {

    public static void main(String[] args) {
// dodajmy tych wszystkich employee do listy. Następnie stwórzmy nową listę.
// W niej umieścimy wszystkich pracowników którzy będą do zwolnienia.
// Robimy pętlę w której do nowej listy pracowników do zwolnienia dodajemy każdego kto zarabia poniżej 10 tys.

        Employee kristoff = new Employee("Kristof", "123", 15000);
        Employee kasia = new Employee("Kasia", "324", 25000);
        Employee grazynka = new Employee("Grażynka", "456", 3500);
        Employee karol = new Employee("Karol", "433", 13000);
        Employee zbigniew = new Employee("Zbigniew", "555", 13000);
        Employee joanna = new Employee("Joanna", "322", 1500);
        Employee aziz = new Employee("Aziz", "333", 4999);

        List<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(kristoff);
        allEmployees.add(kasia);
        allEmployees.add(grazynka);
        allEmployees.add(karol);
        allEmployees.add(zbigniew);
        allEmployees.add(joanna);
        allEmployees.add(aziz);

        List<Employee> employeesToBeFired = new ArrayList<>();
        for (Employee singleEmployee : allEmployees
        ) {
            if (singleEmployee.getSlary() < 10000) {
                employeesToBeFired.add(singleEmployee);
                System.out.println(singleEmployee);
            }
        }
        randomlyFired(employeesToBeFired);
    }
    public static Employee randomlyFired(List<Employee> employeesToBeFired) {
        Random rand = new Random();
        int numberOfPersonToFired = rand.nextInt(employeesToBeFired.size());
        System.out.println("Osoba do zwolnienia: " + employeesToBeFired.get(numberOfPersonToFired));
        return employeesToBeFired.get(numberOfPersonToFired);
    }
}
