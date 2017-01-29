package Maatriks;

/**
 * Created by kirstin on 29/01/2017.
 */
/**
 * Prindi konsooli 10x100 maatriks, kus läheb joon sikk-sakk ülevalt alla.
 *
 * Näide:
 * x
 *  x
 *   x
 *    x
 *     x
 *      x
 *       x
 *        x
 *         x
 *          x
 *         x
 *        x
 *       x
 *      x
 *     x
 *    x
 *   x
 *  x
 * x
 *  x
 *   x
 *    x
 *     x
 *      jne.
 *
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
 */
public class Naide {
    public static void main(String[] args) {
        boolean edasi = true;
        int m = 0;

        for (int i = 0; i < 100; i++) {
            if(edasi){
                for (int k = 0; k <10 ; k++) {
                    if (k == m) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                    if (k == 9) {
                        System.out.println();
                        m++;
                    }
                }
            }

            if (!edasi){
                for (int k = 0; k <10 ; k++) {
                    if (k == m) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                    if (k == 9) {
                        System.out.println();
                        m--;
                    }
                }
            }

            if (m==10){
                edasi = false;
                m=m-2;
            }

            if (m==0){
                edasi = true;
            }
        }
    }
}