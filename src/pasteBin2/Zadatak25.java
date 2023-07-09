package pasteBin2;

public class Zadatak25 {
    
    static double degToRad(double n){
        return Math.toRadians(n);
    }

    static double radToDeg(double n) {
        return Math.toDegrees(n);
    }
    
    public static void main(String[] args) {
        /*
        * a)Napisati funkciju koja konvertuje stepene u radijane
        * b)Napisati funkciju koja konvertuje radijane u stepene
        * */
        System.out.println(degToRad(180));
        System.out.println(radToDeg(Math.PI));
    }
}
