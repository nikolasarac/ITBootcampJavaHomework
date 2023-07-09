package pasteBin;

import java.util.Scanner;

public class Zadatak13 {
    public static void main(String[] args) {
        /*
        * Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t,
        * koji je strogo manji od njega (dakle t < n),
        * sumu svih pozitivnih celih brojeva od 1 do tog broja (dakle 1 + 2 + 3 + ... + t)
        * */
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ceo broj: ");
        int n = sc.nextInt();


        for (int t = 1; t < n; t++) {
            int suma = 0;
            for (int i = 1; i <= t; i++) {
                suma += i;
            }
            System.out.println(suma);
        }
    }
}
