package pasteBin2;

import java.util.Scanner;

public class Zadatak30 {

    static int pogodiBroj() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj koji Java treba da pogodi: ");
        int x = sc.nextInt();
        int brojac = 0;
        int random = -1;

        while (random != x) {
            random = (int) (Math.random() * 100 + 1);
            System.out.println("Java broj: " + random + " | brojac: " + ++brojac);
            //brojac++;
        }
        return brojac;
    }

    public static void main(String[] args) {
        /*
         * Napisati funkciju koja vraca broj pokusaja koji su bili potrebni da javin nasumicni generator brojeva pogodi zadati celi broj iz intervala [1, 100]
         * */
        System.out.println(pogodiBroj());
    }
}
