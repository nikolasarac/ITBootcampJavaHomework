package domaciOOP.domaci11;

public class TestSport {
    public static void main(String[] args) {
        Sportista novak = new Sportista("Novak Djokovic", 10000);
        //System.out.println(novak);

        Sportista jokic = new Sportista("Nikola Jokic", 15000);
        //System.out.println(jokic);

        Sportista bogdanovic = new Sportista("Bogdan Bogdanovic", 5000);
        //System.out.println(bogdanovic);

        SportskiKlub srbija = new SportskiKlub("Beograd", 50000, novak, jokic, bogdanovic);
        //System.out.println(srbija);

        //System.out.println("Budzet nakon isplate");
        //System.out.println(srbija.isplati());

        //System.out.println("\nProsecna plata");
        //System.out.println(srbija.prosecnoPlaceni() + "\n");

        srbija.removePreplaceni();
        //System.out.println(srbija.getClanovi());
        //System.out.println("!!! Nakon izbacivanja preplacenih");
        //System.out.println(srbija);

        // MANCHESTER
        Sportista degea = new Sportista("David de Gea", 10000);
        Sportista jones = new Sportista("Phil Jones", 7000);
        Sportista varane = new Sportista("Raphael Varane", 9000);
        Sportista rashford = new Sportista("Marcus Rashford", 25000);
        Manchester manchester = new Manchester("Manchester", 500000, degea, jones, varane, rashford);

        System.out.println(manchester);
        System.out.println("Prosecna plata: " + manchester.prosecnoPlaceni());
        manchester.removePreplaceni();
        System.out.println(manchester);
        System.out.println("Budzet pre isplate: " + manchester.getBudzet());
        manchester.isplati();
        System.out.println("Budzet posle isplate: " + manchester.getBudzet());

        // ARSENAL
        Sportista saka = new Sportista("Bukayo Saka", 12000);
        Sportista odegaard = new Sportista("Martin Odegaard", 9000);
        Sportista ramsdale = new Sportista("Aaron Ramsdale", 7000);
        Sportista martinelli = new Sportista("Gabriel Martinelli", 14000);
        Arsenal arsenal = new Arsenal("London", 450000, saka, odegaard, ramsdale, martinelli);

        System.out.println(arsenal);
        System.out.println("Prosecna plata: " + arsenal.prosecnoPlaceni());
        System.out.println("Budzet pre isplate: " + arsenal.getBudzet());
        arsenal.isplati();
        System.out.println("Budzet posle isplate: " + arsenal.getBudzet());
        arsenal.removePreplaceni();
        System.out.println(arsenal);

        // SPARTAK
        Sportista miodragovic = new Sportista("Ilija Miodragovic", 600);
        Sportista msanga = new Sportista("Alphonce Msanga", 800);
        Sportista sreckovic = new Sportista("Nikola Sreckovic", 750);
        Sportista tabakovic = new Sportista("Dimitrije Tabakovic", 1000);
        Spartak spartak = new Spartak("Subotica", 70000, miodragovic, msanga, sreckovic);

        System.out.println(spartak);
        System.out.println("Budzet: " + spartak.getBudzet());
        System.out.println("Prosecna plata: " + spartak.prosecnoPlaceni());
        spartak.removePreplaceni();
        System.out.println(spartak);

    }
}
