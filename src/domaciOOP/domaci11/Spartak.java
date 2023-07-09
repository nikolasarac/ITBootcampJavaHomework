package domaciOOP.domaci11;

import java.util.ArrayList;

public class Spartak extends SportskiKlub{
    private String imeKluba = "Spartak";

    // KONSTRUKTORI

    public Spartak(ArrayList<Sportista> clanovi, String grad, double budzet) {
        super(clanovi, grad, budzet);
    }

    public Spartak(){

    }
    public Spartak(String grad, double budzet, Sportista... clanovi) {
        super(grad, budzet, clanovi);
    }

    // GETTER i SETTER
    public String getImeKluba() {
        return imeKluba;
    }

    public void setImeKluba(String imeKluba) {
        this.imeKluba = imeKluba;
    }

    // METODE
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(imeKluba).append("\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
