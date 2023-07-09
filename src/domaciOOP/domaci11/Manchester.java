package domaciOOP.domaci11;

import java.util.ArrayList;

public class Manchester extends SportskiKlub{
    private String imeKluba = "Manchester United";

    // KONSTRUKTORI
    public Manchester(ArrayList<Sportista> clanovi, String grad, double budzet) {
        super(clanovi, grad, budzet);
    }

    public Manchester() {
    }

    public Manchester(String grad, double budzet, Sportista... clanovi) {
        super(grad, budzet, clanovi);
    }

    // GETTER
    public String getImeKluba() {
        return imeKluba;
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
