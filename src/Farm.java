import java.util.ArrayList;

public class Farm {
    ArrayList<Flower> kytky= new ArrayList<>();

    public String Zasazeni(Flower r){
        kytky.add(r);
        return "kytka byla zasazena";

    }

}
