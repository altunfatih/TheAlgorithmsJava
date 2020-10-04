import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            n = 9 ise
               *
              ***
             *****
            *******
           *********
            klavyeden girilen n ye göre belirtilen deseni ekrana yazdıran program
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("n'yi giriniz: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i = i + 2) {
            for (int k = 1; k <= (n - i) / 2; k++)
                System.out.print(" ");
            for (int k = 0; k < i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
