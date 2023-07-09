package domaci5;

public class Zadatak2 {
    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {6, 7, 8, 9, 10};
        int[] niz3 = new int[niz1.length]; // Mogao sam i da stavim 5, ali kao ako odlucim da promenim duzinu nizova da ne moram i tu da menjam

        for (int i = 0; i < niz1.length; i++) {
            niz3[i] = niz1[i] + niz2[i];
        }

        for (int i = 0; i < niz1.length; i++) {
            System.out.print(niz3[i] + " ");
        }
    }
}
