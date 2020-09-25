import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        dizinin ilk n elemanını dizinin sonunaatayan ve baştaki elemanları sıfırlayan program
         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int n, size;
        size = 10;

        System.out.print("n'yi giriniz: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++)
            a[size - 1 -i] = a[n -1 -i];

        for (int i = 0; i < size - n; i++)
            a[i] = 0;

        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
}