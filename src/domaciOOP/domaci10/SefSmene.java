package domaciOOP.domaci10;

public class SefSmene extends Radnik {
    private double nedeljniBonus;

    public SefSmene(String ime, int brojOdradjenihSati, double satnica, double nedeljniBonus) {
        super(ime, brojOdradjenihSati, satnica);
        this.nedeljniBonus = nedeljniBonus;
    }

    public double getNedeljniBonus() {
        return nedeljniBonus;
    }

    public void setNedeljniBonus(double nedeljniBonus) {
        if (nedeljniBonus < 0)
            this.nedeljniBonus = nedeljniBonus * -1;
        else
            this.nedeljniBonus = nedeljniBonus;
    }

    @Override
    public void daLiTrebaNaOdmor() {
        if (getBrojOdradjenihSati() > 50)
            System.out.println(getIme() + " je na odmoru.\n");
        else
            System.out.println(getIme() + " nije na odmoru.\n");
    }

    @Override
    public double nedeljnaZarada() {
        return super.nedeljnaZarada() + getNedeljniBonus();
    }

    @Override
    public String toString() {
        return "Sef " + super.toString();
    }
}
