package pasteBin;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        /*
        * Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0, "Negativan" ako je strogo manji od 0 ili "Neutralan" ako je tacno 0
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite jedan ceo broj: ");
        int broj = sc.nextInt();
        if(broj > 0) {
            System.out.println("Pozitivan");
        } else if (broj < 0) {
            System.out.println("Negativan");
        } else {
            System.out.println("Neutralan");
        }
    }
}
