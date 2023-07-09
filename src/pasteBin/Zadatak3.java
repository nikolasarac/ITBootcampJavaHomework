package pasteBin;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        /*
         *  Za uneta dva broja a i b ispisati rezultat svih 5 osnovnih aritmetickih operacija: a+b, a-b, a*b, a/b, a%b
         * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite dva broja: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Zbir unetih brojeva je: " + (a + b));
        System.out.println("Razlika unetih brojeva je: " + (a - b));
        System.out.println("Proizvod unetih brojeva je: " + (a * b));
        System.out.println("Količnik unetih brojeva je: " + (a / b));
        System.out.println("Ostatak pri deljenju unetih brojeva je: " + (a % b));

    }
}
