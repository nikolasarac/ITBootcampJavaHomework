package pasteBin2;

public class Zadatak26 {

    static double zbirSinCosTanCtg(double n){
        return Math.sin(n) + Math.cos(n) + Math.tan(n) + 1/Math.tan(n);
    }

    public static void main(String[] args) {
        /*
        * Napisati funkciju koji za zadat ugao u radijanima racuna zbir sinusa, kosinusa, tangensa i kotangensa tog ugla
        * */
        System.out.println(zbirSinCosTanCtg(45));
    }
}
