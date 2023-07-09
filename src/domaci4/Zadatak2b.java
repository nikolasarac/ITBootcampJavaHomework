package domaci4;

public class Zadatak2b {
    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < niz.length; i++) {
            if (i % 2 == 0) niz[i] += 2;
        }
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }
    }
}
