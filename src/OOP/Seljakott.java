package OOP;
import java.util.ArrayList;
/**
 * Created by kirstin on 29/01/2017.
 */
public class Seljakott {
    
        ArrayList <String> list = new ArrayList();
        String omanik;

        public Seljakott (String omanikuNimi){
            omanik = omanikuNimi;
        }


        public void lisaAsi(String toode) {
            list.add(toode);
        }

        public void eemaldaAsi(String toode) {
            list.remove(toode);
        }

        public String misOnKotis() {
            String vastus="";
            if (list.size() ==0){
                vastus = "mitte kui midagi";
            } else {

                for (int i = 0; i < list.size(); i++) {
                    vastus += list.get(i);
                    vastus += " ";
                }
            }
            return vastus;
        }

        public String mituAsjaOnKotis() {
            int mitu = list.size();
            String mitu2 = Integer.toString(mitu);
            return mitu2;
        }

        public String omanikuNimi() {
            return omanik;
        }

        public void rebene() {
            list.clear();
        }
    }

