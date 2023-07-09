package pasteBin;

public class Zadatak33 {

    static void ispisNiza(int[] niz){
        for (int el:niz) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
    static int[] cifre(int n) {
        int duzina = String.valueOf(n).length();
        int[] cifre = new int[duzina];
        for (int i = duzina - 1; i >= 0; i--) {
            cifre[i] = n % 10;
            n /= 10;
        }
        return cifre;
    }

    static int suma(int[] brojevi) {
        int sum = 0;
        for (int i = 0; i < brojevi.length; i++) {
            if(i % 2 == 0) {
                sum += brojevi[i];
            } else sum -= brojevi[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        /*
         * Za unet k-tocifren broj n izracunati sumu n1 - n2 + n3 - .... +/- nk, gde su n1,n2,n3,...,
         * nk cifre broja n citane s leva na desno, redom
         * */
        System.out.println(suma(cifre(54321))); // 5 - 4 + 3 - 2 + 1 = 3
        System.out.println(suma(cifre(99))); // 9 - 9 = 0
    }
}
