package pasteBin2;

import java.util.Scanner;

public class Zadatak4 {

    static void svakiTreciUnazad(int[] niz){
        for (int i = niz.length - 1; i >= 0; i-=3) {
            System.out.print(niz[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
        *  Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
        *  Ispisati svaki treci element u obrnutom redosledu
        *  b) Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj koji odredjuje duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];

        System.out.println("Unesite " + duzinaNiza + " brojeva u niz: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        svakiTreciUnazad(niz);
    }
}
