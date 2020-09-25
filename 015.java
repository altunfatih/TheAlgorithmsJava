import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        n klavyeden girilen pozitif bir sayıdır. n çift ise 0 dan n'ye kadar olan çift sayıları
        tek ise 1 den n'ye kadar olan tek sayıları ekrana yazdıran program
         */
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N' yi giriniz: ");
        n = scanner.nextInt();

        for (int i = n % 2; i <= n; i = i + 2)
            System.out.println(i);
    }
}
