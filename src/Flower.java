import java.util.ArrayList;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;
    protected boolean vyrostla;

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

    public Flower(String name, double price, double chanceOfGrowth, double neededArea) {
        this.name = name;
        this.price = price;
        this.chanceOfGrowth = chanceOfGrowth;
        this.neededArea = neededArea;
    }
public abstract double zavlazeni();

    public boolean isVyrostla() {
        return vyrostla;
    }

    public void setVyrostla(boolean vyrostla) {
        this.vyrostla = vyrostla;
    }
}
