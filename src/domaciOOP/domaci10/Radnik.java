package domaciOOP.domaci10;

public class Radnik {
    private String ime;
    private int brojOdradjenihSati;
    private double satnica;

    // KONSTRUKTORI
    public Radnik(String ime, int brojOdradjenihSati, double satnica) {
        this.ime = ime;
        postaviBrojOdradjenihSati(brojOdradjenihSati);
        this.satnica = satnica;
    }

    // GETTER i SETTER

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getBrojOdradjenihSati() {
        return brojOdradjenihSati;
    }

    public void setBrojOdradjenihSati(int brojOdradjenihSati) {
        if (brojOdradjenihSati < 0)
            this.brojOdradjenihSati = brojOdradjenihSati * -1;
        else
            this.brojOdradjenihSati = brojOdradjenihSati;
    }

    public double getSatnica() {
        return satnica;
    }

    public void setSatnica(double satnica) {
        if (satnica < 0)
            this.satnica = satnica * -1;
        else
            this.satnica = satnica;
    }


    // METODE
    public void postaviBrojOdradjenihSati(int brojOdradjenihSati) {
        if (brojOdradjenihSati < 0)
            this.brojOdradjenihSati = brojOdradjenihSati * -1;
        else
            this.brojOdradjenihSati = brojOdradjenihSati;
    }
    public double nedeljnaZarada() {
        return brojOdradjenihSati * satnica;
    }

    public void daLiTrebaNaOdmor() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ima ").append(brojOdradjenihSati).append(" odradjenih sati").append("\n");
        sb.append("Satnica mu je ").append(satnica).append(" din/h").append("\n");
        sb.append("Ove nedelje je zaradio ").append(nedeljnaZarada()).append(" dinara\n");
        return sb.toString();
    }
}
