package pasteBin2;

public class Zadatak9 {

    static int maxEl(int[] niz) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > max)
                max = niz[i];
        }
        return max;
    }

    public static void main(String[] args) {
        /*
         * Napisati funkciju koja vraca najveci element niza
         * */
        int[] niz = {1, 2, 3, 4, 395, 5, 6, 7, 8, 9};
        System.out.println(maxEl(niz));
    }
}
