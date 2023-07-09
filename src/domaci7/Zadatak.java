package domaci7;


import java.util.ArrayList;

public class Zadatak {

    static ArrayList<Integer> kreirajListu() {
        ArrayList<Integer> lista = new ArrayList<>();
        int i = 2;
        while (lista.size() < 20) {
            lista.add(i);
            i += 2;
        }
        return lista;
    }

    static ArrayList<Integer> eliminisiDeljiveSa4(ArrayList<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 4 == 0)
                lista.remove(i);
        }
        return lista;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = kreirajListu();
        System.out.println(lista);
        System.out.println(eliminisiDeljiveSa4(lista));
    }
}
