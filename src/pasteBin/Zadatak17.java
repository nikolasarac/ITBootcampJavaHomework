package pasteBin;

import java.util.Scanner;

public class Zadatak17 {

    static void kalkulator(double a, char operacija, double b) {
        switch (operacija) {
            case '+':
                System.out.println("Zbir unetih brojeva je: " + (a + b));
                break;
            case '-':
                System.out.println("Razlika unetih brojeva je: " + (a - b));
                break;
            case '*':
                System.out.println("Proizvod unetih brojeva je: " + a * b);
                break;
            case '/':
                System.out.println("Kolicnik unetih brojeva je: " + a / b);
                break;
            case '%':
                System.out.println("Ostatak pri deljenju unetih brojeva je: " + a % b);
            case '^':
                System.out.println("Rezultat stepenovanja prvog broja drugim je: " + Math.pow(a, b));
        }
    }

    public static void main(String[] args) {
        /*
         *  Napraviti digitron koji prima double, char, double, gde je char neki od simbola: {+, -, *, /, %, ^}
         *  i ispisuje resenje odgovarajuce operacije.
         * */
        kalkulator(2.5, '*', 5);
    }
}
