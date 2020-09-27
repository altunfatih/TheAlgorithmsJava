import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        a dizisini b dizisine ters atayan program
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = {17, 5, 20, 21, 9, 18, 1, 3, 8, 4};
         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = new int[10];
        int size;
        size = 10;

        for (int i = 0; i < size; i++)
            b[size - i - 1] = a[i];

        for (int i = 0; i < size; i++)
            System.out.print(b[i] + " ");
    }
} 
