package pasteBin2;

import java.util.Scanner;

public class Zadatak5 {

    static int proizvodElemenataNiza(int[] niz){
        int proizvod = 1;
        for (int i = 0; i < niz.length; i++) {
            proizvod *= niz[i];
        }
        return proizvod;
    }

    public static void main(String[] args) {
        /*
        * Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz
        * Izracunati proizvod elemenata tog niza
        * b) Napisati funkciju koja racuna proizvod elemenata zadatog niza
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj koji odredjuje duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];

        System.out.println("Unesite " + duzinaNiza + " brojeva u niz: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        int proizvod = 1;
        for (int i = 0; i < niz.length; i++) {
            proizvod *= niz[i];
        }
        System.out.println("Proizvod unetih brojeva je: " + proizvodElemenataNiza(niz));
    }
}
