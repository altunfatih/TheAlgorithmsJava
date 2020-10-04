import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            n = 7 ise
               *
               *
               *
            *******
               *
               *
               *
            klavyeden girilen n ye göre belirtilen deseni ekrana yazdıran program
            n'yi tek kabul ediyoruz!!
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("n'yi giriniz: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (i == (n / 2 + 1))
                for (int k = 1; k <= n; k++)
                    System.out.print("*");
            else {
                for (int k = 1; k <= n / 2; k++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
