package pasteBin;

import java.util.Scanner;

public class Zadatak14 {
    public static void main(String[] args) {
        /*
        * Za unete brojeve a i b ispisati veci od njih
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dva cela broja:");
        int a = sc.nextInt();
        int b = sc.nextInt();

       System.out.println(Math.max(a, b));
    }
}
