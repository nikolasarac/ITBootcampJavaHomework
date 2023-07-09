package projekat;


public class Projekat {

    /*
     * Ispis niza stringova
     * */
    static void ispisNizaStringova(String niz[]) {
        for (String el : niz) {
            System.out.printf(el + " ");
        }
        System.out.println();
    }

    /*
     *  Ispis double niza
     * */
    static void ispisDoubleNiza(double niz[]) {
        for (double el : niz) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    /*
     *  Ispis int niza
     * */
    static void ispisIntNiza(int niz[]) {
        for (int el : niz) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    /*
     * 1) Napraviti funkciju koja kao argument prima niz Stringova
     *    i String koji zelimo da lociramo u tom nizu.
     *    Kao rezultat vratiti true/false ukoliko se nalazi/ne nalazi u nizu.
     * */
    static boolean find(String rec, String[] niz) {
        for (String el : niz) {
            if (el.equalsIgnoreCase(rec)) return true;
        }
        return false;
    }

    /* 2) Napraviti funkciju koja prima niz celih brojeva i
     *    kao rezultat vraca nov niz gde je svaki
     *    element pomnozen sa Pi
     **/
    static double[] pomnozenoSaPI(int[] brojevi) {
        final double PI = Math.PI;
        double[] pomnozeni = new double[brojevi.length];
        for (int i = 0; i < pomnozeni.length; i++) {
            pomnozeni[i] = brojevi[i] * PI;
        }
        return pomnozeni;
    }

    /*
     *  3) Napraviti funkciju koja ce za prosledjeni String obrnuti redosled karaktera.
     **/
    static void reverseIspis(String rec) {
        for (int i = rec.length() - 1; i >= 0; i--) {
            System.out.print(rec.charAt(i));
        }
    }

    static String reverse(String rec) {
        String obrnuto = "";
        for (int i = rec.length() - 1; i >= 0; i--) {
            String s = new String(String.valueOf(rec.charAt(i)));
            obrnuto += s;
        }
        return obrnuto;
    }

    /*
     *  4) Napraviti funkciju koja ce primati niz Stringova, String koji zelimo da zamenimo,
     *     i String sa kojim zelimo da ga zamenimo u tom nizu
     * */
    static void replaceWith(String[] niz, String oldString, String newString) {
        boolean postoji = true;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i].equalsIgnoreCase(oldString)) {
                niz[i] = newString;
                postoji = true;
            } else postoji = false;
        }
        if (postoji) {
            ispisNizaStringova(niz);
        } else System.out.println("String koji zelite da zamenite ne postoji u nizu");
    }

    /*
     *  5) Napraviti funkciju koja prima String, String zapis ce biti u vidu nekog broja(npr "123",
     *     "741",..), funkcija treba ovaj String da pretvori u ceo broj
     *     i da ispise svaki broj koji je deljiv sa tim brojem.
     */
    static void deljivSa(String broj) {
        int br = Integer.parseInt(broj);
        for (int i = 1; i <= br; i++) {
            if(br % i == 0) System.out.print(i + " ");
        }
    }

    /*    6) Napraviti funkciju koja prima dva niza celih brojeva(ne moraju da budu iste velicine),
     *       porediti svaki broj na istoj poziciji i u zavisnosti od toga koji je veci dodati ga u rezultujuci
     *       niz, ako jednom nizu ponestane elemenata za poredjenje sa drugim nizom, samo ispisati
     *       preostale elemente.
     * */
    static int[] najveci(int[] niz1, int[] niz2) {
        int[] finalNiz;
        int kraciNiz;
        if(niz1.length >= niz2.length) {
            finalNiz = new int[niz1.length];
            kraciNiz = niz2.length;
        } else {
            finalNiz = new int[niz2.length];
            kraciNiz = niz1.length;
        }
        for (int i = 0; i < kraciNiz; i++) {
            if (niz1[i] >= niz2[i]) {
                finalNiz[i] = niz1[i];
            } else finalNiz[i] = niz2[i];
        }
        for (int i = kraciNiz; i < finalNiz.length; i++) {
            if (niz1.length > niz2.length) {
                finalNiz[i] = niz1[i];
            } else finalNiz[i] = niz2[i];
        }
        return finalNiz;
    }


    /* ==================    MAIN    ================== */

    public static void main(String[] args) {
        // 1. find
        String[] niz = {"Programiranje", "Java", "Bootcamp", "Kurs", "Test Case"};
        //System.out.println(find("programiranje", niz));
        //System.out.println(find("Javascript", niz));

        // 2. pomnozenoSaPI
        int[] nizBrojeva = {1, 2, 3};
        //ispisDoubleNiza(pomnozenoSaPI(nizBrojeva));

        // 3. reverse
        String ime = "aleksandar";
        //reverse(ime);
        //System.out.println(reverse(ime));

        // 4. replaceWith
        String[] izmeniMe = {"Ponedeljak", "Petak", "Utorak", "Sreda", "Cetvrtak", "Petak", "Ponedeljak"};
        //replaceWith(izmeniMe, "Ponedeljak", "Nedelja");
        //replaceWith(izmeniMe, "subota", "Nedelja");

        // 5. deljivSa
        //deljivSa("999");

        // 6. najveci
        int[] niz6 = {1,9,3, 5, 15, 0, 7, 4};
        int[] niz7 = {2,5,4,7,6};
        // Expected output => 2, 9, 4, 7, 6
        //ispisIntNiza(najveci(niz6,niz7));
    }
}
