package Algoritm;

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */
public class Suusailm {
    public static void main(String[] args) {
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};

        int positive1 = 0;
        int negative1 = 0;
        int positive2 = 0;
        int negative2 = 0;

            for (int i : kraadid1){
                if (i>0){
                    positive1++;

                }
                else if (i<0){
                    negative1++;
                }
            }
            int difference = positive1-negative1;
            System.out.println(positive1);
            System.out.println(negative1);
            System.out.println(difference);

            for (int i : kraadid2){
                if (i>0){
                    positive2++;

                }
                else if (i<0){
                    negative2++;
                }
            }
            difference = positive2-negative2;
            System.out.println(positive2);
            System.out.println(negative2);
            System.out.println(difference);

        }
}
