package pasteBin2;

public class Zadatak10 {

    static int minEl(int[] niz) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < min)
                min = niz[i];
        }
        return min;
    }

    public static void main(String[] args) {
        /*
        * Napisati funkciju koja vraca najmanji element niza
        * */
        int[] niz = {1, 2, 3, 4, 395, -5, 6, 7, 8, 9};
        System.out.println(minEl(niz));
    }
}
