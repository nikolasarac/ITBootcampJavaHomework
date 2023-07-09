package domaciOOP.domaci9;

import java.util.ArrayList;

public class Fakultet {
    private String naziv;
    private ArrayList<Departman> departmani;

    // KONSTRUKTORI
    public Fakultet(String naziv, ArrayList<Departman> departmani) {
        this.naziv = naziv;
        kreirajDepartmane(departmani);
    }

    public Fakultet(String naziv, Departman... departmani) {
        this.naziv = naziv;
        this.departmani = new ArrayList<>();
        for (Departman d : departmani) {
            this.departmani.add(d);
        }
    }

    // GETTER i SETTER


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Departman> getDepartmani() {
        return departmani;
    }

    public void setDepartmani(ArrayList<Departman> departmani) {
        this.departmani = departmani;
    }

    // METODE
    public void kreirajDepartmane(ArrayList<Departman> departmani) {
        this.departmani = new ArrayList<Departman>();
        for (Departman d : departmani) {
            this.departmani.add(d);
        }
    }

    public int ukupnoStudenata() {
        int sum = 0;
        for (int i = 0; i < departmani.size(); i++) {
            sum += departmani.get(i).getBrojStudenata();
        }
        return sum;
    }

    public void dodajPredmete(ArrayList<Departman> departmani) {
        for (Departman d : departmani) {
            if (d.getNaziv().equalsIgnoreCase("matematika") || d.getNaziv().equalsIgnoreCase("biologija")) {
                d.setBrojStrucnihPredmeta(d.getBrojStrucnihPredmeta() + 5);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fakultet: ").append(naziv).append("\n");
        for (Departman d : departmani) {
            sb.append(departmani).append("\n");
        }
        return sb.toString();
    }
}
