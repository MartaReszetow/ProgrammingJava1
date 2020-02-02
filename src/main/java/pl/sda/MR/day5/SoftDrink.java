package pl.sda.MR.day5;

import java.util.Objects;

public class SoftDrink {


    private String name;
    private String company;
    private double price;


    public SoftDrink(String name, String company, double price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SoftDrink{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SoftDrink)) return false;
        SoftDrink softDrink = (SoftDrink) o;
        return Double.compare(softDrink.price, price) == 0 &&
                Objects.equals(name, softDrink.name) &&
                Objects.equals(company, softDrink.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, price);
    }
}
