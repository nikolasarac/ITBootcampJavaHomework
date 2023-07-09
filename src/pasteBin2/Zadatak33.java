package pasteBin2;

public class Zadatak33 {
    static void ispisNiza(int[] niz) {
        for (int el : niz) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    static int[] rotiraj(int[] niz, int brojRotacija) {
        if (brojRotacija == 0 || brojRotacija == niz.length) {
            return niz;
        }
        int[] rotiran = new int[niz.length];

        if (brojRotacija < 0) {
            for (int i = 0; i < niz.length - 1; i++) {
                rotiran[i] = niz[i + 1];
            }
            rotiran[niz.length - 1] = niz[0];
            brojRotacija++;
        }
        if(brojRotacija > 0) {
            for (int i = niz.length - 1; i > 0; i--) {
                rotiran[i] = niz[i - 1];
            }
            rotiran[0] = niz[niz.length - 1];
            brojRotacija--;
        }
        return rotiraj(rotiran, brojRotacija);
    }

    public static void main(String[] args) {
        /*
         * Napisati funkciju koja za zadati niz celih brojeva i zadati ceo broj k
         * vraca taj niz zarotiran za k mesta, gde znak broja k odredjuje smer rotacije
         * Primeri:
         * [1, 2, 3, 4, 5], k = 1 -> [5, 1, 2, 3, 4]
         * [1, 2, 3, 4, 5], k = -8 -> [4, 5, 1, 2, 3]
         * [1, 2], k = 0 -> [1, 2]
         * */
        int[] niz = {1, 2, 3, 4, 5};
        ispisNiza(rotiraj(niz, 1));
        ispisNiza(rotiraj(niz, -8));
        ispisNiza(rotiraj(niz, 0));
    }
}
