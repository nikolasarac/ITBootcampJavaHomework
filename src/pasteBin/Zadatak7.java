package pasteBin;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        /*
        *  Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite jedan negativan ceo broj: ");
        int n = sc.nextInt();
        if (n > 0) n *= -1;

        for (int i = n; i <= 0; i++) {
            System.out.print(i + " ");
        }
    }
}
