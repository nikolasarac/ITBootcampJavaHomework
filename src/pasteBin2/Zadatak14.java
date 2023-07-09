package pasteBin2;

import java.util.Arrays;

public class Zadatak14 {

    static int zbirDrugiMinMax(int[] niz) {
        int zbir;
        Arrays.sort(niz);
        return zbir = niz[1] + niz[niz.length - 2];
    }

    public static void main(String[] args) {
        /*
         * Napisati funkciju koja vraca zbir drugog najmanjeg i drugog najveceg elementa niza
         * */
        int[] niz = {5, 1, 2, 4, 7, 8, 6, 10};
        System.out.println(zbirDrugiMinMax(niz));
    }
}
