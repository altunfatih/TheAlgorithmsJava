import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        dizinin son n adet elemanını sondan başa doğru yazdıran program
        17 5 20 21
         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int n, size;
        size = 10;

        System.out.print("n' yi giriniz: ");
        n = scanner.nextInt();

        for (int i = size - 1; i >= size - n; i--) {
            System.out.print(a[i] + " ");
        }
    }
}