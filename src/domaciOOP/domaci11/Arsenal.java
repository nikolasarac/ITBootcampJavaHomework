package domaciOOP.domaci11;

import java.util.ArrayList;

public class Arsenal extends SportskiKlub{
    private String imeKluba = "Arsenal";

    // KONSTRUKTORI
    public Arsenal(ArrayList<Sportista> clanovi, String grad, double budzet) {
        super(clanovi, grad, budzet);
    }

    public Arsenal() {
    }

    public Arsenal(String grad, double budzet, Sportista... clanovi) {
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
