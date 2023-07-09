package domaciOOP.domaci12;

public class TestVozila {

    public static void setujOstecenja(MotornoVozilo mv){
        for (Tocak t: mv.getTockovi()) {
            mv.daLiJeOstecen(t);
        }
    }

    public static void main(String[] args) {
        Tocak t1 = new Tocak(150, 5000);
        Tocak t2 = new Tocak(35, 5000);
        Tocak t3 = new Tocak(160, 5000);
        Tocak t4 = new Tocak(120, 5000);

        Tocak t5 = new Tocak(256, 2000);
        Tocak t6 = new Tocak(199, 2000);
        Tocak t7 = new Tocak(366, 2000);
        Tocak t8 = new Tocak(33, 2000);

        Kamion k1 = new Kamion(20000, 2021, t1,t2,t3,t4);
        Automobil a1 = new Automobil(25000, 2023, t5, t6, t7, t8);
        Motor m1 = new Motor(5000, 2014, t1, t5);

        // setovanje ostecenja
        setujOstecenja(k1);
        setujOstecenja(a1);
        setujOstecenja(m1);


        //System.out.println(k1);
        k1.removeOstecenu();
        //System.out.println(k1);
        k1.ubaciRezervnu();
        //System.out.println(k1);

        a1.removeOstecenu();
        a1.ubaciRezervnu();
        //System.out.println(a1);

        m1.removeOstecenu();
        m1.ubaciRezervnu();
        System.out.println(m1);

    }
}
