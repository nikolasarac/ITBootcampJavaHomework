package domaciOOP.domaci12;

import java.util.ArrayList;

public class Automobil extends MotornoVozilo{
    public Automobil(int cena, int godinaProizvodnje, ArrayList<Tocak> tockovi) {
        super(cena, godinaProizvodnje, tockovi);
    }

    public Automobil(int cena, int godinaProizvodnje, Tocak... tockovi) {
        super(cena, godinaProizvodnje, tockovi);
    }

    @Override
    public boolean daLiJeOstecen(Tocak t) {
        if (t.getTrajanjeGume() > 365) {
            t.setOstecenje(true);
            return true;
        } else {
            t.setOstecenje(false);
            return false;
        }
    }

    @Override
    public void removeOstecenu() {
        for (int i = getTockovi().size() - 1; i >= 0; i--) {
            if (getTockovi().get(i).isOstecenje())
                getTockovi().remove(i);
        }
    }

    @Override
    public void ubaciRezervnu() {
        Tocak rezerva = new Tocak(0, 2000);
        while (getTockovi().size() < 6) {
            getTockovi().add(rezerva);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AUTOMOBIL\n");
        sb.append(super.toString());
        return sb.toString();
    }

}
