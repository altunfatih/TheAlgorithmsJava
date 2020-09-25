import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        2. dizi yardımıyla a dizisini n defa kayddıran program
         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = new int[18];
        int size, n;
        size = 10;

        System.out.print("n'yi giriniz: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++)
            b[i] = a[i];

        for (int i = n; i < size; i++) {
            a[i - n] = a[i];
        }

        for (int i = 0; i < n; i++)
            a[size - n + i] = b[i];

        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
}