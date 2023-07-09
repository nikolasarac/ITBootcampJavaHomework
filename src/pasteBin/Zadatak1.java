package pasteBin;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*
        *  Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite jedan ceo broj: ");
        int broj = sc.nextInt();

        if (broj % 2 == 0) {
            System.out.println("Paran");
        } else System.out.println("Neparan");
    }
}
