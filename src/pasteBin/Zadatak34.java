package pasteBin;

public class Zadatak34 {

    static int skrivenBroj(int n){
        if(n < 10) return n;
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        return skrivenBroj(sum);
    }

    public static void main(String[] args) {
        /*
        * Za zadati celi broj n izracunati njegov skriven broj.
        * Skriven broj se racuna tako sto sabiramo njegove cifre sve dok ne dobijemo jednocifren broj.
        *
        * Npr 9999 -> 9 jer:
        * 9+9+9+9 = 36
        * 3+6 = 9
        * */
        System.out.println(skrivenBroj(955));
    }
}
