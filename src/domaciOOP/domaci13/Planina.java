package domaciOOP.domaci13;

public class Planina {
    private int visina;
    private String naziv;

    // KONSTRUKTORI
    public Planina(int visina, String naziv) {
        postaviVisinu(visina);
        this.naziv = naziv;
    }
    public Planina(){
        this.naziv = "";
    }

    // GET i SET
    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        postaviVisinu(visina);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    // METODE
    public int postaviVisinu(int visina){
        if (visina < 0) {
            this.visina = Math.abs(visina); // da ne bih ispisivao greske ili stavljao 0
        } else this.visina = visina;
        return this.visina;
    }

    @Override
    public String toString() {
        return "Planina " + "'" + naziv + "'" + " je visoka " + visina + " metara";
    }


}
