import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Klavyen girilen sayıyının tersinden yeni bir sayı elde eden progrma
        7235 -> 5327
         */

        Scanner scanner = new Scanner(System.in);

        int n, digit, newn;
        newn = 0;

        System.out.print("Sayı giriniz: ");
        n = Integer.parseInt(scanner.nextLine());

        while (n != 0) {
            digit = n % 10;
            newn = newn * 10 + digit;
            n = n/10;
        }

        System.out.println(newn);
    }
}