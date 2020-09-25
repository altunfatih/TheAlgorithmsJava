import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        n klavyeden girilen pozitif bir sayıdır. n çift ise 0 dan n'ye kadar olan çift sayıları
        tek ise 1 den n'ye kadar olan tek sayıları ekrana yazdıran program
         */

        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a giriniz: ");
        a = scanner.nextInt();
        System.out.print("b giriniz: ");
        b = scanner.nextInt();

        if (a < b)
            for (int i = a; i <= b; i++)
                System.out.println(i);
        else
            for (int i = a; i >= b; i--)
                System.out.println(i);
    }
}