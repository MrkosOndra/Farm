public class Mrkev extends Flower{
    public Mrkev(String name, double price, double chanceOfGrowth, double neededArea) {
        super(name, price, chanceOfGrowth, neededArea);
    }

    @Override
    public double zavlazeni() {
        return chanceOfGrowth+3;
    }
}
