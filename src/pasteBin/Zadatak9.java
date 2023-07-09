package pasteBin;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        /*
         *  Ispisati proizvod prvih n celih brojeva [1, n] - n je broj koji unosi korisnik
         * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite jedan ceo broj: ");
        int n = sc.nextInt();

        int proizvod = 1;
        for (int i = 1; i <= n; i++) {
            proizvod *= i;
        }
        System.out.println(proizvod);
    }
}
