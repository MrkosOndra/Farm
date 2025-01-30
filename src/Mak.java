public class Mak extends Flower{
    public Mak(String name, double price, double chanceOfGrowth, double neededArea) {
        super(name, price, chanceOfGrowth, neededArea);
    }

    @Override
    public double zavlazeni() {
        return chanceOfGrowth+10;
    }

}
