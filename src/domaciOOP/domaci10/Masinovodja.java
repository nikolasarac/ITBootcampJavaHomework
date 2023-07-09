package domaciOOP.domaci10;

public class Masinovodja extends Radnik{
    
    public Masinovodja(String ime, int brojOdradjenihSati, double satnica) {
        super(ime, brojOdradjenihSati, satnica);
    }

    @Override
    public double nedeljnaZarada() {
        return super.nedeljnaZarada();
    }

    @Override
    public void daLiTrebaNaOdmor() {
        if (getBrojOdradjenihSati() > 30)
            System.out.println(getIme() + " je na odmoru.\n");
        else
            System.out.println(getIme() + " nije na odmoru.\n");
    }

    @Override
    public String toString() {
        return "Masinovodja " + super.toString();
    }
}
