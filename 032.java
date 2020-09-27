import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        klavyeden s ve n giriliyor. Dizinin s nolu elamanından başlayarak n adet eleamanını
        kendi içinde tersine çeviren program
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        s = 5 - n = 4
        int a[] = {4, 8, 3, 1, 18, 5, 20, 21, 9, 17};
         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size, temp, s, n;
        size = 10;

        System.out.print("s yi griniz: ");
        s = scanner.nextInt();
        System.out.print("n yi giriniz: ");
        n = scanner.nextInt();

        for (int i = 0; i < n / 2; i++) {
            temp = a[s + i];
            a[s + i] = a[s + n - i - 1];
            a[s + n - i - 1] = temp;
        }
        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
} 
