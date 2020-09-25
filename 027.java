import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        dizinin elemanlarını bir öne kaydıran ve dizinin ilk elemanını dizinin sonuna atayan program
         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size, temp;
        size = 10;

        temp = a[0];

        for (int i = 1; i < size; i++)
            a[i - 1] = a[i];
        a[size - 1] = temp;

        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
}