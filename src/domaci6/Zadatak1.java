package domaci6;

import java.util.Scanner;

public class Zadatak1 {

    static int[] kreirajNiz(Scanner skener, int duzinaNiza) {
        int[] niz = new int[duzinaNiza];

        System.out.println("Unesite " + duzinaNiza + " brojeva u niz: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = skener.nextInt();
        }
        return niz;
    }

    static int[] neparanUParan(int[] niz){
        for (int i = 0; i < niz.length; i++) {
            if(niz[i] % 2 != 0) niz[i]++;
        }
        return niz;
    }

    static void ispisNiza(int niz[]) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = kreirajNiz(sc, duzinaNiza);
        neparanUParan(niz);
        ispisNiza(niz);
    }
}
