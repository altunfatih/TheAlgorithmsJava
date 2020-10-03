import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            n = 4 ise
            *
            * *
            * * *
            * * * *
            klavyeden girilen n ye göre belirtilen deseni ekrana yazdıran program
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("n'yi giriniz: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i + 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
