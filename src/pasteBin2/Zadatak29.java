package pasteBin2;

public class Zadatak29 {

    static double poluprecnik(double p){
        // P = PI*r^2 -> r = sqrt(P/PI)
        return Math.sqrt(p/Math.PI);
    }

    public static void main(String[] args) {
        /*
        * Napisati fuknciju koja vraca double duzinu poluprecnika kruga za prosledjenu double povrsinu kruga
        * */
        System.out.println(poluprecnik(78.5));
    }
}
