package domaciOOP.domaci13;

import java.util.ArrayList;

public class TestPlaninarenje {

    public static void izbaciNedostizne(Planinar planinar){ // ovo sam dodao jer za jedan konstruktor nisam implementirao proveru da li planinar moze da se popne na svaku planinu
        for (int i = planinar.getOsvojenePlanine().size() - 1; i >= 0; i--) {
            if (planinar.getOsvojenePlanine().get(i).getVisina() > planinar.getMaxUspon())
                planinar.getOsvojenePlanine().remove(planinar.getOsvojenePlanine().get(i));
        }
    }

    public static void main(String[] args) {

        Planina staraPlanina = new Planina(2169, "Stara planina");
        Planina kopaonik = new Planina(2017, "Kopaonik");
        Planina montEverest = new Planina(8848, "Mont Everest");
        Planina kilimandzaro = new Planina(5895, "Kilimandzaro");

        ArrayList<Planina> listaPlanina = new ArrayList<>();
        listaPlanina.add(kilimandzaro);
        listaPlanina.add(montEverest);
        listaPlanina.add(kopaonik);

        Planinar p1 = new Planinar(4000, 35, staraPlanina, kilimandzaro);
        //System.out.println(p1);
        p1.popniSe(kopaonik);
        p1.popniSe(montEverest);
        System.out.println(p1);

        System.out.println();
        Planinar p2 = new Planinar(6000, 40, kilimandzaro, montEverest, kopaonik, staraPlanina);
        System.out.println(p2);

        System.out.println();
        Planinar p3 = new Planinar(7000, 50, listaPlanina);
        izbaciNedostizne(p3);
        System.out.println(p3);
    }
}
