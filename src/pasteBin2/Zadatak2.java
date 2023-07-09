package pasteBin2;

import java.util.Scanner;

public class Zadatak2 {

    static void ispisiSvakiDrugi(int[] niz){
        for (int i = 0; i < niz.length; i+=2) {
            System.out.print(niz[i] + " ") ;
        }
    }

    public static void main(String[] args) {
        /*
        *  Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
        *  b) Napraviti funkciju koja ispisuje svaki drugi element zadatog niza
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj koji odredjuje duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];

        System.out.println("Unesite " + duzinaNiza + " brojeva u niz: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        ispisiSvakiDrugi(niz);

    }
}
