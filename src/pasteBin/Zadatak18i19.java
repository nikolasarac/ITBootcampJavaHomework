package pasteBin;

import java.util.Scanner;

public class Zadatak18i19 {

    static double suma(Scanner scanner) {
        System.out.println("Unesite pozitivan ceo broj:");
        int n = scanner.nextInt();
        if (n < 0) n *= -1;

        double suma = 0;
        System.out.println("Unesite " + n + " realnih brojeva: ");
        for (int i = 0; i < n; i++) {
            suma += scanner.nextDouble();
        }
        return suma;
    }

    static double proizvod(Scanner scanner) {
        System.out.println("Unesite pozitivan ceo broj:");
        int n = scanner.nextInt();
        if (n < 0) n *= -1;

        double proizvod = 1;
        System.out.println("Unesite " + n + " realnih brojeva: ");
        for (int i = 0; i < n; i++) {
            proizvod *= scanner.nextDouble();
        }
        return proizvod;
    }

    public static void main(String[] args) {
        /*
         * 18. Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double)
         *
         * 19. Uneti pozitivan ceo broj n. Zatim izracunati proizvod unetih narednih n brojeva (double).
         *
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println(suma(sc));
        System.out.println(proizvod(sc));
    }
}
