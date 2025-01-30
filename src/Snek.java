public class Snek extends Animal{
    public Snek(String type, String name, Size size, String specialCare) {
        super(type, name, size, specialCare);
    }

    @Override
    public String Pohlazeni() {
        return "Snek je stastny";
    }
}
