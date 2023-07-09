package domaciOOP.domaci9;

public class Departman {
    private String naziv;
    private int brojStudenata;
    private int brojStrucnihPredmeta;

    // KONSTRUKTOR
    public Departman(String naziv, int brojStudenata, int brojStrucnihPredmeta) {
        this.naziv = naziv;
        postaviBrojStudenata(brojStudenata);
        postaviBrojStrucnihPredmeta(brojStrucnihPredmeta);
    }

    // GETTER i SETTER

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStudenata() {
        return brojStudenata;
    }

    public void setBrojStudenata(int brojStudenata) {
        if (brojStudenata < 0) {
            System.out.println("Uneli ste neispravan broj! Broj studenata ostaje " + this.brojStudenata + "\n");
        } else
            this.brojStudenata = brojStudenata;
    }

    public int getBrojStrucnihPredmeta() {
        return brojStrucnihPredmeta;
    }

    public void setBrojStrucnihPredmeta(int brojStrucnihPredmeta) {
        if (brojStrucnihPredmeta < 0) {
            System.out.println("Uneli ste neispravan broj! Broj strucnih predmeta ostaje " + this.brojStrucnihPredmeta + "\n");
        } else
            this.brojStrucnihPredmeta = brojStrucnihPredmeta;
    }

    // METODE
    public void postaviBrojStudenata(int brojStudenata) {
        if (brojStudenata < 0) {
            this.brojStudenata = -1;
        } else
            this.brojStudenata = brojStudenata;
    }

    public void postaviBrojStrucnihPredmeta(int brojStrucnihPredmeta) {
        if (brojStrucnihPredmeta < 0) {
            this.brojStrucnihPredmeta = -1;
        } else
            this.brojStrucnihPredmeta = brojStrucnihPredmeta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departman: ").append(naziv).append("\n");
        if (brojStudenata == -1) {
            sb.append("! ! ! Uneli ste neispravan broj studenata ! ! !\n");
        } else if (brojStudenata == 0) {
            sb.append("Nema studenata na ovom departmanu.\n");
        } else {
            sb.append("Broj studenata: ").append(brojStudenata).append("\n");
        }
        if (brojStrucnihPredmeta == -1) {
            sb.append("! ! ! Uneli ste neispravan broj strucnih predmeta ! ! !\n");
        } else if (brojStrucnihPredmeta == 0) {
            sb.append("Nema strucnih predmeta.\n");
        } else {
            sb.append("Broj strucnih predmeta: ").append(brojStrucnihPredmeta).append("\n");
        }
        return sb.toString();
    }
}
