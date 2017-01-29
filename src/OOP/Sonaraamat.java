package OOP;

import java.util.ArrayList;

/**
 * Created by kirstin on 29/01/2017.
 */
public class Sonaraamat {
    String raamatukeel;
    ArrayList <String> sonad = new ArrayList<>();
    ArrayList <String> vasted = new ArrayList<>();

    public Sonaraamat (String keel){
        raamatukeel = keel;
    }

    public void sisestaSona(String sona) {
        sonad.add(sona);
    }

    public String[] otsiEsimeseTaheJargi(String taht) {
        vasted.clear();
    for (int i = 0; i<sonad.size(); i++){
        if (sonad.get(i).startsWith(taht)){
            vasted.add(sonad.get(i));
        }
    }
    String [] vastetekogum = new String[vasted.size()];
       for (int j=0; j<vasted.size(); j++){
          vastetekogum [j]= vasted.get(j);

        }
        return vastetekogum;
    }

    public void eemaldaSona(String eemaldatav) {
        for (int i = 0; i<sonad.size();i++){
            if (sonad.get(i).equals(eemaldatav)){
                sonad.remove(eemaldatav);

            }
        }
        for (int j = 0; j< sonad.size();j++){
            System.out.println(sonad.get(j));
        }
        }

    public void misKeelesRaamatOn() {
        System.out.println(raamatukeel);
    }
}
