package domaciOOP.domaci8;

public class TestAutoSkola {
    public static void main(String[] args) {
        AutoSkola punGas = new AutoSkola("Pun Gas", 12, 50000, "motor");
        AutoSkola majstoreZadnja = new AutoSkola("Majstore zadnja", 22, 80000, "autobus");
        AutoSkola brzineTiIduuH = new AutoSkola("Brzine ti idu u H", 9, 25000, "automobil");

        System.out.println(punGas);
        System.out.println("\n===========================\n");
        System.out.println(majstoreZadnja);
        System.out.println("\n===========================\n");
        System.out.println(brzineTiIduuH);
    }
}
