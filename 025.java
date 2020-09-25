import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        kalvyeden s ve n giriliyor. Dizinin s nolu elemanından başlayarak n adet elemanın ekrana yazdıran program

         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int n, s, size;
        size = 10;

        System.out.print("s' yi giriniz: ");
        s = scanner.nextInt();
        System.out.print("n' yi giriniz: ");
        n = scanner.nextInt();

        for (int i = s; i < s + n ; i++) {
            System.out.print(a[i] + " ");
        }
    }
}