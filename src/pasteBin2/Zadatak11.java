package pasteBin2;

public class Zadatak11 {

    static void ispis(int[] niz){
        for (int el:niz) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
    static int[] duplirajElemente(int[] niz){
        int[] dupliran = new int[niz.length];
        for (int i = 0; i < dupliran.length; i++) {
            dupliran[i] = niz[i] * 2;
        }
        return dupliran;
    }

    public static void main(String[] args) {
        /*
        * Napisati funkciju koja duplira sve elemente niza
        * Primer: [1, 2, 3, 4, 5] -> [2, 4, 6, 8, 10]
        * */
        int[] niz = {1,2,3,4,5};
        ispis(duplirajElemente(niz));
    }
}
