package pasteBin;

import java.util.Scanner;

public class Zadatak20 {
    public static void main(String[] args) {
        /*
         * *Unose se double konstante a, b, c, a zatim i pozitivan ceo broj n.
         *  Zatim se unose n double brojeva jedan po jedan.
         *  Cim se unese jedan od tih brojeva, na standardni izlaz ispisuje se vrednost polinoma: a*x^2 + b*x + c, gde je x taj uneti broj
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tri konstante (realni brojevi): ");
        final double a = sc.nextDouble();
        final double b = sc.nextDouble();
        final double c = sc.nextDouble();

        System.out.println("Unesite pozitivan ceo broj: ");
        int brojac = sc.nextInt();
        if (brojac < 0) brojac *= -1;

        while (brojac > 0) {
            System.out.println("Unesite jedan realan broj (x):");
            double broj = sc.nextDouble();
            System.out.println("a*x^2 + b*x + c = " + (a*Math.pow(broj,2) + b*broj + c));
            brojac--;
        }

    }
}
