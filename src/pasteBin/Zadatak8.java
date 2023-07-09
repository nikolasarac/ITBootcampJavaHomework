package pasteBin;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        /*
         *  Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n
         * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite jedan pozitivan ceo broj: ");
        int n = sc.nextInt();
        if (n < 0) n *= -1;

        for (int i = -14; i <= 2 * n; i++) {
            System.out.print(i + " ");
        }
    }
}
