package Algoritm;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {
    public static void main(String[] args) {

    String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3

    double sum = 0;
    double tempCount = 0;
    double len = naide.length;
        System.out.println(len);

        for (int i=0; i<naide.length; i++){
        String tempelement= naide[i];
        tempCount = tempelement.length();
        sum = sum + tempCount;

    }
        System.out.println(sum);
        System.out.println(len);
    double average = sum/len;
        System.out.println(average);

    int soneCount = 0;

        for (int j=0; j<naide.length; j++){
        String tempelement= naide[j];
        tempCount = tempelement.length();
        if (tempCount>average){
            soneCount++;
        }
    }
        System.out.println(soneCount);


}
}

/* lühemalt:
public class PikadSoned {
    public static void main(String[] args) {
        double summa = 0;
        int counter = 0;
        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3
        for (int i = 0; i < naide.length ; i++) {
            summa += naide[i].length();

        }
        double keskmine = summa/naide.length;

        for (int i = 0; i < naide.length; i++) {
            if (naide[i].length()>keskmine){
                counter += 1;
            }
        }
        System.out.println(counter);
    }


}
 */