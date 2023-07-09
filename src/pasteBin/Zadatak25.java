package pasteBin;

import java.util.Scanner;

public class Zadatak25 {

    static double prosecnaCena(Scanner skener) {
        System.out.println("Unesite cene artikala (0 za prekid unosa): ");
        double cena;
        double suma = 0;
        int brojac = -1;
        do {
            cena = skener.nextDouble();
            suma += cena;
            brojac++;
        } while (cena != 0);
        return suma / brojac;
    }

    public static void main(String[] args) {
        /*
         * Korisnik unosi cene artikala sve dok ne unese 0. Ispisati prosecnu vrednost artikala.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println(prosecnaCena(sc));
    }
}
