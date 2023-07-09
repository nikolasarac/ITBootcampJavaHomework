package domaci1;

public class Zadatak1 {
    public static void main(String[] args) {
        String ime = "Nikola";
        String prezime = "Sarac";
        int godinaRodjenja = 1992;
        int godinaZaposlenja = 2017;
        int trenutnaGodina = 2023;

        int radniStaz = trenutnaGodina - godinaZaposlenja;

        System.out.println("Ime i prezime: " + ime + " " + prezime);
        System.out.println("Godina rodjenja: " + godinaRodjenja);
        System.out.println("Godine radnog staza: " + radniStaz);
    }
}
