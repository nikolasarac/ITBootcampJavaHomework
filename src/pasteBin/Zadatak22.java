package pasteBin;

public class Zadatak22 {

    static void opisUcenika(String imeIPrezime, String predmet, double prosecnaOcena){
        String[] atribut = {"veoma dobar/a", "dobar/a", "veoma los/a"};
        String[] kategorija = {"prirodnih nauka", "jezika", "opstih predmeta"};

        if (prosecnaOcena >= 2.5 && prosecnaOcena < 3.5) {
            if (predmet.equalsIgnoreCase("Matematika") || predmet.equalsIgnoreCase("Fizika") || predmet.equalsIgnoreCase("Hemija")) {
                System.out.println(imeIPrezime + " je " + atribut[1] + " iz " + kategorija[0] + " jer je imao/la prosecnu ocenu " + prosecnaOcena + " iz predmeta " + predmet.toLowerCase());
            } else if (predmet.equalsIgnoreCase("Srpski") || predmet.equalsIgnoreCase("Engleski")) {
                System.out.println(imeIPrezime + " je " + atribut[1] + " iz " + kategorija[1] + " jer je imao/la prosecnu ocenu " + prosecnaOcena + " iz predmeta " + predmet.toLowerCase());
            } else if (predmet.equalsIgnoreCase("Biologija") || predmet.equalsIgnoreCase("Istorija") || predmet.equalsIgnoreCase("Geografija")) {
                System.out.println(imeIPrezime + " je " + atribut[1] + " iz " + kategorija[2] + " jer je imao/la prosecnu ocenu " + prosecnaOcena + " iz predmeta " + predmet.toLowerCase());
            }
        } else if (prosecnaOcena >= 3.5) {
            if (predmet.equalsIgnoreCase("Matematika") || predmet.equalsIgnoreCase("Fizika") || predmet.equalsIgnoreCase("Hemija")) {
                System.out.println(imeIPrezime + " je " + atribut[0] + " iz " + kategorija[0] + " jer je imao/la prosecnu ocenu " + prosecnaOcena + " iz predmeta " + predmet.toLowerCase());
            } else if (predmet.equalsIgnoreCase("Srpski") || predmet.equalsIgnoreCase("Engleski")) {
                System.out.println(imeIPrezime + " je " + atribut[0] + " iz " + kategorija[1] + " jer je imao/la prosecnu ocenu " + prosecnaOcena + " iz predmeta " + predmet.toLowerCase());
            } else if (predmet.equalsIgnoreCase("Biologija") || predmet.equalsIgnoreCase("Istorija") || predmet.equalsIgnoreCase("Geografija")) {
                System.out.println(imeIPrezime + " je " + atribut[0] + " iz " + kategorija[2] + " jer je imao/la prosecnu ocenu " + prosecnaOcena + " iz predmeta " + predmet.toLowerCase());
            }
        } else if (prosecnaOcena < 2.5) {
            if (predmet.equalsIgnoreCase("Matematika") || predmet.equalsIgnoreCase("Fizika") || predmet.equalsIgnoreCase("Hemija")) {
                System.out.println(imeIPrezime + " je " + atribut[2] + " iz " + kategorija[0] + " jer je imao/la prosecnu ocenu " + prosecnaOcena + " iz predmeta " + predmet.toLowerCase());
            } else if (predmet.equalsIgnoreCase("Srpski") || predmet.equalsIgnoreCase("Engleski")) {
                System.out.println(imeIPrezime + " je " + atribut[2] + " iz " + kategorija[1] + " jer je imao/la prosecnu ocenu " + prosecnaOcena + " iz predmeta " + predmet.toLowerCase());
            } else if (predmet.equalsIgnoreCase("Biologija") || predmet.equalsIgnoreCase("Istorija") || predmet.equalsIgnoreCase("Geografija")) {
                System.out.println(imeIPrezime + " je " + atribut[2] + " iz " + kategorija[2] + " jer je imao/la prosecnu ocenu " + prosecnaOcena + " iz predmeta " + predmet.toLowerCase());
            }
        }
    }

    public static void main(String[] args) {
        /*
        * Korisnik unosi ime i prezime (jedan String), ime predmeta (String) i prosecnu ocenu istog (double).
        *
        * Validni predmeti su:
        * {Srpski, Engleski, Matematika, Fizika, Hemija, Fizicko, Biologija, Istorija, Geografija}
        *
        * Na standardni izlaz ispisati poruku:
        * {ime i prezime} je {atribut} iz {kategorija predmeta}, jer je imao/la prosecnu ocenu {prsoecnu ocenu} iz predmeta {ime predmeta}
        *
        * Atributi:
        * 1.) "veoma dobar/ra", ako je prosecna ocena iznad 3.5
        * 2.) "dobar/ra", ako je prosecna ocena izmedju 2.5 i 3.5
        * 3.) "veoma los/a", ako je prsoecna ocena ispod 2.5
        *
        * kategorija predmeta:
        * 1.) "prirodnih nauka" - Matematika, Fizika, Hemija
        * 2.) "jezika" - Srpski, Engleski
        * 3.) "opstih predmeta" - Biologoija, Istorija, Geografija
        *
        * */
        opisUcenika("Nikola Sarac", "fizika", 2.3);
    }
}
