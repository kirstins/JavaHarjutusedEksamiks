package Algoritm;

/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */
public class MaagilineSeitse {

    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};


        double sum = 0;
        double tempVariable = 0;
        double pikkus = naide.length;


            for (int i : naide){
                if (i == 7){
                    tempVariable = i*2;
                    sum = sum + tempVariable;

                }
                else {
                    tempVariable=i;
                    sum= sum + tempVariable;
                }

            }
            System.out.println(sum);
            double average = sum/pikkus;
            System.out.println(average);

    }

}

/** teine võimalus ülesande lahendamiseks

public class MaagilineSeitse {

    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};
        for (int i = 0; i < naide.length ; i++) {
            if (naide[i] == 7){
                naide[i] = naide[i]*2;
            }
        }
        System.out.println(Arrays.toString(naide));
        int summa = 0;
        for (int i = 0; i < naide.length ; i++) {
            summa += naide[i];
        }
        int keskmine = summa/naide.length;
        System.out.println(keskmine); //61
    }
}
*/