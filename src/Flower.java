public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

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
}
