package domaci3;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double plata = 500;

        System.out.println("Unesite budzet firme: ");
        double budzetFirme = sc.nextDouble();
        System.out.println("Unesite broj zaposlenih u firmi: ");
        double brojZaposlenih = sc.nextDouble();

        if (budzetFirme < brojZaposlenih * plata) {
            System.out.println("Firma nema dovoljno sredstava da isplati sve radnike");
        } else {
            for (int i = 1; i <= brojZaposlenih; i++) {
                budzetFirme -= plata;
            }
            System.out.println("Svi radnici su isplaceni.");
            System.out.println("Stanje na racunu firme je: " + budzetFirme);
        }
    }
}
