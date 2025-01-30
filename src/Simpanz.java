public class Simpanz extends Animal{
    public Simpanz(String type, String name, Size size, String specialCare) {
        super(type, name, size, specialCare);
    }

    @Override
    public String Pohlazeni() {
        return "Simpanz to nema rad:(";
    }
}
