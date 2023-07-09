package pasteBin;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        /*
         *  Za uneta dva broja ispisati poruku "Istog znaka" ako su oba broja istog znaka, a poruku "Suprotnog znaka", ako nisu istog znaka
         * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite dva broja: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= 0 && b >= 0) System.out.println("Istog znaka");
        else if (a < 0 && b < 0) System.out.println("Istog znaka");
        else System.out.println("Suprotnog znaka");

    }
}
