package domaciOOP.domaci11;

import java.util.ArrayList;

public class SportskiKlub {
    private ArrayList<Sportista> clanovi;
    private String grad;
    private double budzet;

    // KONSTRUKTORI
    public SportskiKlub(ArrayList<Sportista> clanovi, String grad, double budzet) {
        this.clanovi = clanovi;
        this.grad = grad;
        this.budzet = budzet;
    }

    public SportskiKlub() {
        clanovi = new ArrayList<>();
    }

    public SportskiKlub(String grad, double budzet, Sportista... clanovi) {
        this.grad = grad;
        this.budzet = budzet;
        this.clanovi = new ArrayList<>();
        for (Sportista s : clanovi) {
            this.clanovi.add(s);
        }
    }

    // GETTER i SETTER
    public ArrayList<Sportista> getClanovi() {
        return clanovi;
    }

    public void setClanovi(ArrayList<Sportista> clanovi) {
        this.clanovi = clanovi;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public double getBudzet() {
        return budzet;
    }

    public void setBudzet(double budzet) {
        this.budzet = budzet;
    }

    // METODE
    public double isplati() {
        for (int i = 0; i < clanovi.size(); i++) {
            budzet -= clanovi.get(i).getPlata();
        }
        return budzet; // ostavio sam namerno da mogu da odu u minus
    }

    public double prosecnoPlaceni() {
        double sum = 0;
        for (Sportista s : clanovi) {
            sum += s.getPlata();
        }
        return sum / clanovi.size();
    }

    public void removePreplaceni() {
        double prosek = prosecnoPlaceni();
        for (int i = clanovi.size() - 1; i >= 0; i--) {
            if (clanovi.get(i).getPlata() > prosek)
                clanovi.remove(i);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Grad: ").append(grad).append("\n");
        sb.append("Clanovi kluba: \n");
        for (Sportista s:clanovi) {
            sb.append(s.getIme()).append("\n");
        }
        return sb.toString();
    }
}
