package domaciOOP.domaci12;

public class Tocak {
    private int trajanjeGume;
    private boolean ostecenje;
    private int cena;

    public Tocak(int trajanjeGume, boolean ostecenje, int cena) {
        this.trajanjeGume = trajanjeGume;
        this.ostecenje = ostecenje;
        this.cena = cena;
    }

    public Tocak(int trajanjeGume, int cena) {
        this.trajanjeGume = trajanjeGume;
        this.cena = cena;
    }

    public int getTrajanjeGume() {
        return trajanjeGume;
    }

    public void setTrajanjeGume(int trajanjeGume) {
        this.trajanjeGume = trajanjeGume;
    }

    public boolean isOstecenje() {
        return ostecenje;
    }

    public void setOstecenje(boolean ostecenje) {
        this.ostecenje = ostecenje;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trajanje gume: ").append(trajanjeGume).append(" dana\n");
        sb.append("Ostecenje: ").append(ostecenje).append("\n");
        sb.append("Cena tocka: ").append(cena).append("\n");
        return sb.toString();
    }
}
