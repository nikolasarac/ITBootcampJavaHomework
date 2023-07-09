package pasteBin;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        /*
        *  Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
        * "Dobrodosao u {x}. razred, {ime} {prezime}",
        *  pod pretpostavkom da je trenutna godina 2023. Pretpostavimo da ima 12 razreda.
        *  A ako korisnik nije djak ispisati jednu odgovarajucu poruku:
        *  "{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"
        * */
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite vase ime: ");
        String ime = sc.nextLine();

        System.out.println("Unesite vase prezime: ");
        String prezime = sc.nextLine();

        System.out.println("Unesite godinu rodjenja: ");
        int godinaRodjenja = sc.nextInt();

        int trenutnaGodina = 2023;
        int brojRazreda = 12;
        int razred;

        // Ako su godine vece od 18 -> zavrsio
        if (trenutnaGodina - godinaRodjenja > brojRazreda + 7) {
            System.out.println(ime + " " + prezime + " je zavrsio skolu.");
        } else if (trenutnaGodina - godinaRodjenja < 7) {
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje.");
        } else {
            razred = trenutnaGodina - godinaRodjenja - 6;
            System.out.println("Dobrodosao u " + razred + "." + " razred, " + ime + prezime);
        }
    }
}
