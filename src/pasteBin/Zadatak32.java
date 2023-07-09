package pasteBin;

public class Zadatak32 {

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
        int suma = brojevi[0] - brojevi[1] + brojevi[2];
        return suma;
    }

    public static void main(String[] args) {
        /*
        * Za unet trocifren broj n izracunati sumu n1 - n2 + n3, gde je n1 vodeca cifra, n2 sredisnja cifra, a n3 polsednja cifra broja n
        * */
        System.out.println(suma(cifre(526)));
    }
}
