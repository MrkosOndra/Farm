public class Zralok extends Animal{
    public Zralok(String type, String name, Size size, String specialCare) {
        super(type, name, size, specialCare);
    }

    @Override
    public String Pohlazeni() {
        return "Bohuzel ukousl ti ruku";
    }
}
