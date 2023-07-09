package pasteBin;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        /*
         *  Za unet cetvorocifren broj ispisati razliku proizvoda njegovih prvih dveju cifara od zbira njegovih drugih dveju cifara.
         * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite jedan četvorocifren broj: ");
        int broj = sc.nextInt();
        int[] niz = new int[4];

        for (int i = niz.length - 1; i >= 0; i--) {
            niz[i] = broj % 10;
            broj /= 10;
        }

        int razlika = niz[0] * niz[1] - (niz[2] + niz[3]);
        System.out.println(razlika);

    }
}
