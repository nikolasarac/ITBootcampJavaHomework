package domaci2;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radniSati, satnica, plata;

        System.out.println("Unesite broj radnih sati: ");
        radniSati = sc.nextInt();
        if(radniSati < 0) {
            System.out.println("Radni sati ne mogu biti negativni. Bice uzeta apsolutna vrednost.");
            radniSati *= -1;
        }
        System.out.println("Unesite cenu po satu: ");
        satnica = sc.nextInt();
        if(satnica < 0) {
            System.out.println("Satnica ne moze biti negativna. Bice uzeta apsolutna vrednost.");
            satnica *= -1;
        }
        System.out.println("Vasa plata je: " + (satnica * radniSati) + " dinara");
    }
}
