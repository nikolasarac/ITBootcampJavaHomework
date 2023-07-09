package pasteBin2;

public class Zadatak8 {

    static void ispisiParne(int[] niz){
        for (int el : niz) {
            if (el % 2 == 0)
                System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
         * Napisati funkciju koja ispisuje sve parne brojeve zadatog niza
         * */

        int[] niz = {1,2,3,4,5,6,7,8,9};
        ispisiParne(niz);
    }
}
