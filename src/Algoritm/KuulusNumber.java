package Algoritm;

import java.util.ArrayList;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7

        ArrayList<Integer> numbrid =new ArrayList<Integer>();

        for (int s : naide){
            if (naide[s]!=3){
                numbrid.add(naide[s]);
            }}

        System.out.println(numbrid);

        int element = 0;
        int count = 0;

        for (int j=0; j<numbrid.size(); j++){
            int tempElement = numbrid.get(j);
            int tempCount = 0;
            for (int p=0; p<numbrid.size(); p++){
                if (numbrid.get(p)==tempElement){
                    tempCount++;
                }
                if(tempCount>count){
                    element=tempElement;
                    count=tempCount;
                }
            }
        }
        System.out.println(element);
        System.out.println(count);
    }

}
