package pasteBin;

public class Zadatak31 {

    static void brojArtikala(double stanjeNaRacunu, double cena){
        System.out.println("Mozete kupiti " + (int)(stanjeNaRacunu/cena) + " komada");
    }

    public static void main(String[] args) {
        /*
         * Korisnik unosi novac na racunu kojim raspolaze kao i cenu nekog artikla.
         * Na standardni izlaz ispisati koliko kopija tog artika korisnik moze da kupi.
         * */
        brojArtikala(1000, 333);
        brojArtikala(1000, 334);
        brojArtikala(250, 333);
    }
}
