public class LedniMedved extends Animal{
    public LedniMedved(String type, String name, Size size, String specialCare) {
        super(type, name, size, specialCare);
    }

    @Override
    public String Pohlazeni() {
        return "Medved je stastny chce este!!!!";
    }
}
