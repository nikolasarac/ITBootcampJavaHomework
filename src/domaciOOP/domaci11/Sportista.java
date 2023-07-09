package domaciOOP.domaci11;

public class Sportista {
    private static int JMBG = 0;
    private String ime;
    private double plata;
    private final int jmbg;

    // KONSTRUKTORI
    public Sportista(String ime, double plata) {
        this.ime = ime;
        this.plata = plata;
        JMBG++;
        jmbg = JMBG;
    }

    // GETTER i SETTER
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public int getJmbg() {
        return jmbg;
    }

    // METODE

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(jmbg).append(" ").append(ime).append(" zaradjuje ").append(plata).append("€ mesecno\n");
        return sb.toString();
    }
}
