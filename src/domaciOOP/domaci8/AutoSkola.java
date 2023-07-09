package domaciOOP.domaci8;

public class AutoSkola {
    String naziv;
    int brojLjudi;
    double cenaPolaganja;
    String tipVozila;

    // KONSTRUKTOR
    public AutoSkola(String naziv, int brojLjudi, double cenaPolaganja, String tipVozila) {
        this.naziv = naziv;
        this.brojLjudi = brojLjudi;
        this.cenaPolaganja = cenaPolaganja;
        this.tipVozila = tipVozila;
    }

    // METODE
    public double popust() {
        double cenaSaPopustom = cenaPolaganja;
        if (tipVozila.equalsIgnoreCase("motor")) {
            cenaSaPopustom = cenaPolaganja * 0.5;
        } else {
            cenaSaPopustom = cenaPolaganja;
        }
        return cenaSaPopustom;
    }

    public int brojGrupa() {
        int brojGrupa;
        if (brojLjudi % 5 == 0) {
            brojGrupa = brojLjudi / 5;
        } else if (brojLjudi / 5 == 1) {
            brojGrupa = 1;
        } else {
            brojGrupa = (brojLjudi / 5) - 1;
        }
        return brojGrupa;
    }

    public boolean mogucePolaganje() {
        if (tipVozila.equalsIgnoreCase("autobus")) {
            return false;
        } else return true;
    }

    @Override
    public String toString() {
        String s1 = "Auto skola: " + naziv + "\n";
        String s2;
        if (brojLjudi < 5) {
            s2 = "Nema dovoljno ljudi da se oformi grupa" + "\n";
            return s1 + s2;
        } else {
            s2 = "Broj ljudi: " + brojLjudi + "\n" + "Broj grupa: " + brojGrupa() + "\n";
        }
        String s3;
        if (tipVozila.equalsIgnoreCase("motor")) {
            s3 = "Imate 50% popusta. Cena je snizena sa " + cenaPolaganja + " na " + popust() + "\n";
        } else {
            s3 = "Cena polaganja je: " + cenaPolaganja + "\n";
        }
        String s4;
        if (mogucePolaganje()) {
            s4 = "Tip vozila: " + tipVozila.toUpperCase() + "\n";
        } else {
            s4 = "Trenutno nije moguce polaganje za " + tipVozila.toUpperCase();
        }

        return s1 + s2 + s3 + s4;
    }
}
