package OOP;

import java.util.ArrayList;

/**
 * Created by kirstin on 28/01/2017.
 */
public class Korter {
    int mahutab;
    ArrayList <String> kylalised = new ArrayList<>();

    public Korter(int suurus){
        mahutab = suurus;

    }
    public void saabus(String kylaline) {
        if (kylalised.size()<mahutab){
            kylalised.add(kylaline);

        }
    }

    public void prindiKylalisteArv() {
        System.out.println(kylalised.size());
    }

    public void prindiPaljuVeelMahub() {
        System.out.println(mahutab-kylalised.size());
    }

    public void lahkus(String lahkuja) {
        for (int i=0; i<kylalised.size(); i++){
            if (kylalised.get(i).equals(lahkuja)){
                kylalised.remove(i);
            }
        }

    }
}
