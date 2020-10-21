import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Klavyen girilen sayıyı basamaklarına ayıran program (while döngüsü ile)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = Integer.parseInt(scanner.nextLine());

        while (n > 0) {
            System.out.println(n % 10);
            n = n/10;
        }
    }
}