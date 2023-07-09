package pasteBin;

import java.util.Scanner;

public class Zadatak15 {
    public static void main(String[] args) {
        /*
        * Za unete brojeve a, b i c ispisati najmanji od njih
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite 3 cela broja:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = Math.min(a, b);
        System.out.println(Math.min(d, c));
    }
}
