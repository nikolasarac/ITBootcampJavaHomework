package pasteBin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak21 {
    public static void main(String[] args) {
        /*
         * Uneti pozitivan ceo broj n. Zatim ispisati najmanji i najveci broj od unetih narednih n brojeva (double)
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite jedan pozitivan ceo broj: ");
        int n = sc.nextInt();

        List<Double> lista = new ArrayList<Double>();
        do {
            System.out.println("Unesite neki realan broj: ");
            double unos = sc.nextDouble();
            lista.add(unos);
            n--;
        } while (n > 0);

        double min = lista.get(0);
        double max = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) < min) min = lista.get(i);
            if (lista.get(i) > max) max = lista.get(i);
        }
        System.out.println("Najmanji broj koji ste uneli je: " + min);
        System.out.println("Najveci broj koji ste uneli je: " + max);
    }
}
