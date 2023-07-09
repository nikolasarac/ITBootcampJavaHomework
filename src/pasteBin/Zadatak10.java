package pasteBin;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        /*
        *  Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite datum rodjenja (DD MM))");
        int dan = sc.nextInt();
        int mesec = sc.nextInt();

        if ((dan >= 21 && mesec == 3) || (dan <= 20 && mesec == 4)) System.out.println("Ovan");
        if ((dan >= 21 && mesec == 4) || (dan <= 21 && mesec == 5)) System.out.println("Bik");
        if ((dan >= 22 && mesec == 5) || (dan <= 21 && mesec == 6)) System.out.println("Blizanci");
        if ((dan >= 22 && mesec == 6) || (dan <= 22 && mesec == 7)) System.out.println("Rak");
        if ((dan >= 23 && mesec == 7) || (dan <= 22 && mesec == 8)) System.out.println("Lav");
        if ((dan >= 23 && mesec == 8) || (dan <= 22 && mesec == 9)) System.out.println("Devica");
        if ((dan >= 23 && mesec == 9) || (dan <= 23 && mesec == 10)) System.out.println("Vaga");
        if ((dan >= 24 && mesec == 10) || (dan <= 22 && mesec == 11)) System.out.println("Skorpija");
        if ((dan >= 23 && mesec == 11) || (dan <= 21 && mesec == 12)) System.out.println("Strelac");
        if ((dan >= 22 && mesec == 12) || (dan <= 20 && mesec == 1)) System.out.println("Jarac");
        if ((dan >= 21 && mesec == 1) || (dan <= 19 && mesec == 2)) System.out.println("Vodolija");
        if ((dan >= 20 && mesec == 2) || (dan <= 20 && mesec == 3)) System.out.println("Ribe");
    }
}
