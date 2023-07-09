package pasteBin2;

public class Zadatak32 {

    static void ispisNiza(int[] niz) {
        for (int el : niz) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    static int[] rotirajZa2UDesno(int[] niz, int brojRotacija) {
        if (brojRotacija <= 0) {
            return niz;
        }
        int[] rotiran = new int[niz.length];

        for (int i = niz.length - 1; i > 0; i--) {
            rotiran[i] = niz[i-1];
        }
        rotiran[0] = niz[niz.length - 1];
        brojRotacija--;

        return rotirajZa2UDesno(rotiran, brojRotacija);
    }

    public static void main(String[] args) {
        /*
         * Napisati funkciju koja za zadati niz celih brojeva vraca taj niz zarotiran za 2 mesta udesno
         * [1, 2, 3, 4, 5] -> [4, 5, 1, 2, 3]
         * */
        int[] niz = {1, 2, 3, 4, 5};
        ispisNiza(rotirajZa2UDesno(niz, 3));
    }
}
