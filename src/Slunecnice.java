public class Slunecnice extends Flower{

    public Slunecnice(String name, double price, double chanceOfGrowth, double neededArea) {
        super(name, price, chanceOfGrowth, neededArea);
    }

    @Override
    public double zavlazeni() {
        return chanceOfGrowth+5;
    }

}
