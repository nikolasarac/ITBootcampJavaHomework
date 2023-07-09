package domaci4;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite jedan pozitivan ceo broj: ");
        int n = sc.nextInt();
        if(n < 0) n *= -1;
        for (int i = 1; i <= n; i++) {
            if(i % 15 == 0) {
                System.out.println(i + ": FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println(i + ": Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + ": Buzz");
            } else System.out.println(i); // ovo ne znam da li je trebalo da se ispisuje, ali sam stavio cisto da se vidi da je petlja isla do n
        }
    }
}
