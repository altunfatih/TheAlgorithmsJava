import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        klavyeden n giriliyor. n den küçük tek elemanları ekrana yazdıran program.
         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        int n, size;
        size = 10;

        System.out.print("n 'yi giriniz: ");
        n = scanner.nextInt();

        for (int i = 0; i < size; i++)
            if (a[i] < n)
                if (a[i] % 2 != 0)
                    System.out.println(a[i] + " ");
    }
}
