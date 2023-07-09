package domaciOOP.domaci10;

public class TestRadnik {
    public static void main(String[] args) {
        Radnik ns = new Radnik("Nikola Sarac", 40, 300);
        System.out.println(ns);

        Masinovodja rodoljub = new Masinovodja("Rodoljub Rodic", 35, 400);
        System.out.println(rodoljub);
        rodoljub.daLiTrebaNaOdmor();

        Fizikalac njutn = new Fizikalac("Isak Njutn", 39, 1000);
        System.out.println(njutn);
        njutn.daLiTrebaNaOdmor();

        SefSmene sef = new SefSmene("Sale", 10, 1200, 5000);
        System.out.println(sef);
    }
}
