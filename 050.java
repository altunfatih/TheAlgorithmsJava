import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
           n = 6 ise
          ******
          *    *
          *    *
          *    *
          *    *
          ******
            klavyeden girilen n ye göre belirtilen deseni ekrana yazdıran program
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("n'yi giriniz: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (i == 1)
                for (int k = 1; k <= n; k++)
                    System.out.print("*");
            else if (i == n)
                for (int k = 1; k <= n; k++)
                    System.out.print("*");
            else {
                System.out.print("*");
                for (int k = 1; k <= n - 2; k++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
