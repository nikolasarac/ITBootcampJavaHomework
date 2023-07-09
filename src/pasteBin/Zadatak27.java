package pasteBin;

import java.util.Scanner;

public class Zadatak27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite visinu h: ");
        int h = sc.nextInt();
        for (int i = 1; i <= h; i++) {
            System.out.println("#".repeat(i));
        }
    }
}
