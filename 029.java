import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        klavyeden s ve n giriliyor. Dizinin s nolu elemanından başlayarak n adet elamanını
        kendi içinde bir öne kaydıran program.
        s = 5 - n = 4
        {4, 8, 3, 1, 18, 21, 20, 5, 9, 17}
         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int s, n;
        int size, temp;
        size = 10;

        System.out.print("s yi giriniz: ");
        s = scanner.nextInt();
        System.out.print("n yi giriniz: ");
        n = scanner.nextInt();

        temp = a[s];

        for (int i = s + 1; i < s + n; i++)
            a[i - 1] = a[i];

        a[s + n - 1] = temp;

        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
}