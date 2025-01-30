public class Mravenec extends Animal{
    public Mravenec(String type, String name, Size size, String specialCare) {
        super(type, name, size, specialCare);
    }

    @Override
    public String Pohlazeni() {
        return "zranil jsi ho musi do nemocnice";
    }
}
