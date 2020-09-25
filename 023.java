import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        dizinin son n adet elemanını baştan sona doğru yazdıran program
        21 20 5 17
         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int n, size;
        size = 10;

        System.out.print("n' yi giriniz: ");
        n = scanner.nextInt();

        for (int i = size - n; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}