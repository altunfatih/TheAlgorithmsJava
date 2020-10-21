import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Klavyen girilen sayıyı basamaklarına ayıran ve bunları bir diziye atayan program
         */

        Scanner scanner = new Scanner(System.in);

        int n, digit, p;
        int a[] = new int[10];
        p = 0;

        System.out.print("Sayı giriniz: ");
        n = Integer.parseInt(scanner.nextLine());

        while (n != 0) {
            digit = n % 10;
            a[p] = digit;
            p++;
            n = n/10;
        }

        for (int k = 0; k < p; k++) {
            System.out.println(a[k]);
        }
    }
}