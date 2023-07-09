package domaci3;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        String rezultat = "";
        while (!userInput.equalsIgnoreCase("stop")) {
            System.out.println("Unesite neki string ('stop' za prekid programa): ");
            userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("stop")) break;
            else {
                rezultat = rezultat + " " + userInput;
            }
        }
        System.out.println(rezultat);
    }
}
