package domaci2;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cenaRuze = 50;
        double cenaZumbula = cenaRuze + 20;
        double cenaOrhideja = 2.5 * cenaZumbula;
        double cenaBonsaija = 3 * cenaOrhideja;

        System.out.println("Unesite ime cveta: ");
        String imeCveta = sc.nextLine();
        if (imeCveta.equals("Zumbul")) System.out.println(imeCveta + " kosta " + cenaZumbula + " dinara");
        else if (imeCveta.equals("Orhideja")) System.out.println(imeCveta + " kosta " + cenaOrhideja + " dinara");
        else if (imeCveta.equals("Bonsai")) System.out.println(imeCveta + " kosta " + cenaBonsaija + " dinara");
        else if (imeCveta.equals("Ruza")) System.out.println(imeCveta + " kosta " + cenaRuze + " dinara");
        else System.out.println("Trazeni cvet ne postoji!");
    }
}
