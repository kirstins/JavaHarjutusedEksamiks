package OOP;

import java.util.ArrayList;

/**
 * Created by kirstin on 28/01/2017.
 */
public class Chat {

    String tuba;
    private String toaNimi;
    // List<String[]> sonumid = new ArrayList<String[]>();
    //teine võimalus oleks seda teha kahe ArrayListiga
    ArrayList <String> sonumid = new ArrayList<>();
    ArrayList <String> kasutajanimed = new ArrayList <>();

    public Chat(String tuba) {
        tuba = toaNimi;
    }

    public void sisestaSonum(String nimi, String sonum) {
        //String [] string = new String [2];
        // string [1] = nimi;
        // string [2] = sonum;
        //sonumid.add(string);
        sonumid.add(sonum);
        kasutajanimed.add(nimi);
    }

    public void prindiKoikSonumidKoosKasutajanimega() {
        for (int i = 0; i <  sonumid.size(); i++) {
            System.out.println(kasutajanimed.get(i) + ": " + sonumid.get(i));
        }
    }

    public void adminKustutabSonumi(String kustutus) {

        for (int i = 0; i <  sonumid.size(); i++) {
            if (kustutus.equals(sonumid.get(i))){
                sonumid.set(i, "Kustutatud admini poolt!");
            }
        }
    }

    public void prindiToaNimi() {
        System.out.println(toaNimi);
    }
}
