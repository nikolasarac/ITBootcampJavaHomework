package domaci5;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] imena = {"Nemanja", "Jovana", "Maja", "Jovana", "Maja", "Vladimir", "Vladimir", "Saska", "Nemanja", "Jovana"};

        System.out.println("Unesite ime koje trazite: ");
        String trazenoIme = sc.nextLine();
        boolean ima = false;
        int brojac = 0;

        for (int i = 0; i < imena.length; i++) {
            if (trazenoIme.equalsIgnoreCase(imena[i])) {
                brojac++;
                ima = true;
            }
        }
        if (ima) System.out.println("Ime " + trazenoIme + " se pojavljuje: " + brojac + " puta");
        else System.out.println("Ime " + trazenoIme + " se ne pojavljuje");
    }
}
