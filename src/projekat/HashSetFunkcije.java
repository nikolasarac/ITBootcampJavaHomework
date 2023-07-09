package projekat;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetFunkcije {

    // RANDOM BEZ PONAVLJANJA i UNOS KORISNIKA U HASHSET
    public static HashSet<Integer> randomBezPonavljanja() {
        HashSet<Integer> bingoBrojevi = new HashSet<>();
        while (bingoBrojevi.size() < 30) {
            int num = ((int) (Math.random() * 39)) + 1;
            bingoBrojevi.add(num);
        }
        return bingoBrojevi;
    }

    public static HashSet<Integer> unosKorisnika() {
        HashSet<Integer> brojevi = new HashSet<>();
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite vasu Bingo kombinaciju (6 brojeva u opsegu [1-39]): ");
        while (brojevi.size() < 6) {
            brojevi.add(skener.nextInt());
        }
        return brojevi;
    }

    public static void ispisHash(HashSet<Integer> hs) {
        for (Integer h : hs) {
            System.out.print(h + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
