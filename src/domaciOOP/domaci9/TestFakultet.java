package domaciOOP.domaci9;

import java.util.ArrayList;

public class TestFakultet {
    public static void main(String[] args) {
        Departman informatika = new Departman("Informatika", 120, 40);
        Departman matematika = new Departman("Matematika", 100, 20);

        //ArrayList<Departman> departmani = new ArrayList<Departman>();
        //departmani.add(informatika);
        //departmani.add(informatika);

        Fakultet etf = new Fakultet("ETF", informatika, matematika);
//        System.out.println(informatika);
        System.out.println(etf);
        System.out.println(etf.ukupnoStudenata());
        etf.dodajPredmete(etf.getDepartmani());
        System.out.println(etf.getDepartmani().get(0).getBrojStrucnihPredmeta());
        System.out.println(etf.getDepartmani().get(1).getBrojStrucnihPredmeta());
    }
}
