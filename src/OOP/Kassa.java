package OOP;

import java.util.ArrayList;

/**
 * Created by kirstin on 28/01/2017.
 */
public class Kassa {
    String kassapidaja;
    ArrayList<String> ostuTsekk = new ArrayList<>();

    public Kassa (String nimi){
        kassapidaja = nimi;

    }
    public void lisaToode(String toode) {
        ostuTsekk.add(toode);
    }

    public void eemaldaToode(String eemaldatav) {
        for (int i=0; i < ostuTsekk.size(); i++){
            if (ostuTsekk.get(i).equals(eemaldatav)){
                ostuTsekk.remove(i);
            }

        }
    }
    //Arraylistid prinditakse tsüklite abil välja
    public void prindiOstutsekk() {
        for (int i=0; i < ostuTsekk.size(); i++){
            System.out.println(ostuTsekk.get(i));
        }
    }

    public void prindiKassapidajaNimi() {
        System.out.println(kassapidaja);
    }
}
