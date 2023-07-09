package pasteBin2;

public class Zadatak12 {

    static void ispis(int[] niz) {
        for (int el : niz) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    static int[] saberiNizove(int[] niz1, int[] niz2) {
        int[] zbir = new int[niz1.length];
        for (int i = 0; i < niz1.length; i++) {
            zbir[i] = niz1[i] + niz2[i];
        }
        return zbir;
    }

    public static void main(String[] args) {
        /*
         * Napisati funkciju koja sabira 2 niza iste duzine element po element.
         * (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)
         * Primer: [2, 4, 6] + [1, 4, 4]  -> [3, 8, 10]
         * */
        int[] niz1 = {2, 4, 6};
        int[] niz2 = {1, 4, 4};

        ispis(saberiNizove(niz1, niz2));
    }
}
