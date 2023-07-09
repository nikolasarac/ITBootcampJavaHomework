package domaciOOP.domaci12;

import java.util.ArrayList;

public abstract class MotornoVozilo {
    private int cena;
    private int godinaProizvodnje;

    private ArrayList<Tocak> tockovi;

    public MotornoVozilo(int cena, int godinaProizvodnje, ArrayList<Tocak> tockovi) {
        this.cena = cena;
        this.godinaProizvodnje = godinaProizvodnje;
        this.tockovi = tockovi;
    }

    public MotornoVozilo(int cena, int godinaProizvodnje, Tocak ... tockovi){
        this.cena = cena;
        this.godinaProizvodnje = godinaProizvodnje;
        this.tockovi = new ArrayList<>();
        for (Tocak t:tockovi) {
            this.tockovi.add(t);
        }
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public ArrayList<Tocak> getTockovi() {
        return tockovi;
    }

    public void setTockovi(ArrayList<Tocak> tockovi) {
        this.tockovi = tockovi;
    }

    public abstract boolean daLiJeOstecen(Tocak t);
    public abstract void removeOstecenu();
    public abstract void ubaciRezervnu();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cena vozila: ").append(cena).append("\n");
        sb.append("Godina proizvodnje: ").append(godinaProizvodnje).append("\n");
        sb.append("Tockovi: \n");
        for (Tocak t: tockovi){
            sb.append(t.toString()).append("\n");
        }
        return sb.toString();
    }
}
