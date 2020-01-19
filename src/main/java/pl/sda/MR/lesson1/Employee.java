package pl.sda.MR.lesson1;

import java.util.Objects;

public class Employee {

    String name;
    String peselNumber;
    int slary;

    public Employee(String name, String peselNumber, int slary) {
        this.name = name;
        this.peselNumber = peselNumber;
        this.slary = slary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + name + '\'' +
                ", peselNumber=" + peselNumber +
                ", slary=" + slary +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return peselNumber == employee.peselNumber &&
                slary == employee.slary &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, peselNumber, slary);
    }
}
