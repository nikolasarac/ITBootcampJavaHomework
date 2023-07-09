package pasteBin2;

import java.util.Scanner;

public class Zadatak3 {

    static int sumaElemenataNiza(int[] niz){
        int suma = 0;
        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        /*
        *  Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza
        *  b) Napraviti funkciju koja vraca sumu prosledjenog niza
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj koji odredjuje duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];

        System.out.println("Unesite " + duzinaNiza + " brojeva u niz: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        System.out.println("Zbir unetih brojeva je: " + sumaElemenataNiza(niz));
    }
}
