package projekat;

import java.util.Scanner;

public class ProjekatZadatak7 {

    /*
     *  Ispis int niza
     * */
    public static void ispisIntNiza(int niz[]) {
        for (int el : niz) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

//    7) Napraviti program koji:

    //    a) Ima funkciju koja omogucava korisniku da unese u niz 6 brojeva(nebitno kojih).
    public static int[] unesiBrojeve() {
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite vasu Bingo kombinaciju (6 brojeva u opsegu [1-39]): ");
        int[] brojeviKorisnika = new int[6];
        for (int i = 0; i < 6; i++) {
            brojeviKorisnika[i] = skener.nextInt();
        }
        return brojeviKorisnika;
    }

    //    b) Funkciju koja generise nasumicnih 30 brojeva.(Ovde ce nam trebati Math.random()
    //    funkcija koja generise Random broj, ali je problem sto generise jedan double broj sa dugom
    //    decimalom, osmislite kako bi vi taj broj skratili i pretvorili ga u ceo broj)

    // BONUS IZAZOV: izgenerisi 30 brojeva u onom poslednjem zadatku ali bez duplikata
    public static int[] randomBrojevi() {
        int[] bingoBrojevi = new int[30];
        for (int i = 0; i < 30; i++) {
            bingoBrojevi[i] = ((int) (Math.random() * 39)) + 1;
        }
        return bingoBrojevi;
    }

    public static int[] izbaciDuplikate(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            for (int j = i + 1; j < niz.length; j++) {
                if (niz[i] == niz[j]) {
                    niz[j] = -1;
                }
            }
        }
        int brElemenata = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] != -1) brElemenata++;
        }
        int brojac = 0;
        int[] bezDuplikata = new int[brElemenata];
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] != -1) {
               bezDuplikata[brojac] = niz[i];
                brojac++;
            }
        }
        return bezDuplikata;
    }

    //    c) Funkcija koja ispisuje korisniku koliko je brojeva pogodio i koje brojeve je pogodio.
    public static void bingo(int[] niz1, int[] niz2) {
        int brojPogodaka = 0;
        for (int i = 0; i < niz1.length; i++) {
            for (int j = 0; j < niz2.length; j++) {
                if (niz1[i] == niz2[j]) {
                    System.out.print(niz1[i] + " ");
                    brojPogodaka++;
                }
            }
        }
        if (brojPogodaka == 0) {
            System.out.println("Nemate pogodaka");
        } else {
            System.out.println();
            System.out.println("Broj pogodaka: " + brojPogodaka);
        }
    }

    public static void main(String[] args) {
        int[] korisnickiBrojevi = unesiBrojeve();
        int[] bingoBrojevi = izbaciDuplikate(randomBrojevi());

        System.out.println("Vasi brojevi: ");
        ispisIntNiza(korisnickiBrojevi);
        System.out.println("======================");

        System.out.println("Bingo brojevi:");
        ispisIntNiza(bingoBrojevi);
        System.out.println("======================");

        bingo(korisnickiBrojevi, bingoBrojevi);
    }
}
