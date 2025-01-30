import java.util.ArrayList;

public class Farm {
    private double volnaplocha=100;
    ArrayList<Flower> kytky= new ArrayList<>();

    public String Zasazeni(Flower r) {
        if(volnaplocha>r.neededArea) {
            kytky.add(r);
            volnaplocha-=r.neededArea;
        }
        return "kytka byla zasazena";
    }

        public String Sklizeni(Flower r){
        if(r.vyrostla=true){
            kytky.remove(r);
        }
           return "sklizeno!!";
        }



}
