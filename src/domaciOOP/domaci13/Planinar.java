package domaciOOP.domaci13;

import java.util.ArrayList;

public class Planinar implements Planinarenje {
    private int maxUspon;
    private int tezinaOpreme;
    private ArrayList<Planina> osvojenePlanine;

    // KONSTRUKTORI
    public Planinar(int maxUspon, int tezinaOpreme, ArrayList<Planina> osvojenePlanine) {
        this.maxUspon = maxUspon;
        this.tezinaOpreme = tezinaOpreme;
        this.osvojenePlanine = osvojenePlanine;
    }

    public Planinar(int maxUspon, int tezinaOpreme, Planina... osvojenePlanine) {
        this.maxUspon = maxUspon;
        this.tezinaOpreme = tezinaOpreme;
        this.osvojenePlanine = new ArrayList<>();
        for (Planina p : osvojenePlanine) {
            if (p.getVisina() < maxUspon)
                this.osvojenePlanine.add(p);
        }
    }

    public Planinar() {
        osvojenePlanine = new ArrayList<>();
    }

    // GET i SET
    public int getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(int maxUspon) {
        this.maxUspon = maxUspon;
    }

    public double getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public ArrayList<Planina> getOsvojenePlanine() {
        return osvojenePlanine;
    }

    public void setOsvojenePlanine(ArrayList<Planina> osvojenePlanine) {
        this.osvojenePlanine = osvojenePlanine;
    }

    // METODE
    @Override
    public void popniSe(Planina p) {
        if (p.getVisina() < maxUspon)
            osvojenePlanine.add(p);
        else
            System.out.println("Previsoka planina za ovog planinara. On moze do " + maxUspon + "m, a " + p.getNaziv() + " je visine " + p.getVisina() + "m");
    }

    @Override
    public int clanarina() {
        return (int) (clanarina - (osvojenePlanine.size() * clanarina * 0.02));
    }

    @Override
    public int sviUsponi() {
        int ukupnoUspona = 0;
        for (Planina p : osvojenePlanine) {
            ukupnoUspona += p.getVisina();
        }
        return ukupnoUspona;
    }

    @Override
    public Planina najvecaPlanina() {
        Planina najveca = osvojenePlanine.get(0);
        for (int i = 1; i < osvojenePlanine.size(); i++) {
            if (osvojenePlanine.get(i).getVisina() > najveca.getVisina())
                najveca = osvojenePlanine.get(i);
        }
        return najveca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Maksimalan uspon ovog planinara je ").append(maxUspon).append(" metara\n");
        sb.append("Tezina opreme: ").append(tezinaOpreme).append("kg\n");
        sb.append("Planine koje je ovaj planinar osvojio:").append("\n");
        if (osvojenePlanine.size() == 0) {
            sb.append("Nije se popeo ni na jednu planinu\n");
        } else {
            for (int i = 0; i < osvojenePlanine.size(); i++) {
                sb.append(" -> ").append(osvojenePlanine.get(i).getNaziv()).append(" [");
                sb.append(getOsvojenePlanine().get(i).getVisina()).append("m]").append("\n");
            }
        }
        sb.append("Ukupne visine osvojenih planina: " + sviUsponi() + "m\n");
        sb.append("Najveca planina na koju se popeo je " + najvecaPlanina().getNaziv() + " visine " + najvecaPlanina().getVisina() + "m\n");
        sb.append("Clanarina: " + clanarina() + " dinara");
        return sb.toString();
    }

}
