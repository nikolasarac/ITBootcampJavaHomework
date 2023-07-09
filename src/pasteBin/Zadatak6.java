package pasteBin;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        /*
         *  Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n
         * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite jedan pozitivan ceo broj: ");
        int n = sc.nextInt();
        if (n < 0) n *= -1;

        for (int i = 0; i <= n; i++) {
            System.out.println(i + " ");
        }

    }
}
