package pasteBin2;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak20 {

    static ArrayList<Integer> unesiElementeNiza(Scanner skener) {
        int n;
        ArrayList<Integer> niz = new ArrayList<Integer>();
        System.out.println("Unesite elemente niza (0 za prekid): ");
        do {
            n = skener.nextInt();
            if (n != 0) {
                niz.add(n);
            }
        } while (n!=0);
        return niz;
    }

    public static void main(String[] args) {
        /*
        * Napisati funkciju koja kreira niz od brojeva koji korisnik unosi sa konzole sve dok ne unese 0
        * Npr: 1 2 3 3 4 5 0 -> [1, 2, 3, 4, 4, 5]
        * */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> niz = unesiElementeNiza(sc);
        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + " ");
        }
        System.out.println();
    }
}
