package pasteBin2;

public class Zadatak13 {

    static void ispis(int[] niz) {
        for (int el : niz) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    static int[] spojiNizove(int[] niz1, int[] niz2) {
        int duzina = niz1.length + niz2.length;
        int[] spojeni = new int[duzina];

        for (int i = 0; i < niz1.length; i++) {
            spojeni[i] = niz1[i];
        }

        int br = niz1.length;
        for (int i = 0; i < niz2.length; i++) {
            spojeni[br++] = niz2[i];
        }
        return spojeni;
    }

    public static void main(String[] args) {
        /*
         * Napisati funkciju koja nadovezuje 2 niza, drugi na kraj prvog
         * Primer: [1, 2, 3] [17, 20, -3, 14, 20] -> [1, 2, 3, 17, 20, -3, 14, 20]
         * */
        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        ispis(spojiNizove(niz1, niz2));
    }
}
