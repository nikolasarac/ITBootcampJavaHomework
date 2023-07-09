package pasteBin;

import java.util.Scanner;

public class Zadatak26 {

    public static void ispisIntNiza(int niz[]) {
        for (int el : niz) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
        * Za unete dve godine g1 i g2 ispisati koliko ima prestupnih godina u intervalu [g1, g2]. Godina je prestupna akko:
        *  - Deljiva je sa 4
        *  - Nije deljiva sa 100 ili je deljiva sa 400
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite dve godine: ");
        int g1 = sc.nextInt();
        int g2 = sc.nextInt();
        int duzina = Math.abs(g1-g2) + 1;
        int pocetnaGodina = Math.min(g1, g2);

        int[] godine = new int[duzina];
        for (int i = 0; i < godine.length; i++) {
            godine[i] = pocetnaGodina++;
        }

        int brojPrestupnih = 0;
        for (int i = 0; i < godine.length; i++) {

            if(godine[i] % 4 == 0) {
                if (godine[i] % 100 != 0 || godine[i] % 400 == 0){
                    System.out.println(godine[i]);
                    brojPrestupnih++;
                }
            }
        }
        System.out.println("Broj prestupnih godina je: " + brojPrestupnih);
        //ispisIntNiza(godine);

    }
}
