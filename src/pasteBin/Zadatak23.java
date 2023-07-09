package pasteBin;

import java.util.Scanner;

public class Zadatak23 {

    static void dvaIstaImenaZaRedom(Scanner skener) {
        System.out.println("Unesite ceo broj n koji je veci od 1: ");
        int n = skener.nextInt();

        String[] imena = new String[n];

        System.out.println("Unesite " + n + " imena: ");
        for (int i = 0; i < n; i++) {
            imena[i] = skener.next();
        }
        String imaNema = "";
        for (int i = 1; i < n; i++) {
            if (imena[i].equalsIgnoreCase(imena[i-1])) {
                imaNema = "Da";
                break;
            } else imaNema = "Ne";
        }
        System.out.println(imaNema);
    }

    public static void main(String[] args) {
        /*
         * Korisnik unosi pozitivan ceo broj n, n >= 2 sa konzole.
         * Zatim se unose imena korisnika.
         * Ispisati "da" ako su uneta dva korisnika sa istim imenom za redom (jedan za drugim), a "ne" inace
         * */
        Scanner sc = new Scanner(System.in);
        dvaIstaImenaZaRedom(sc);
    }
}
