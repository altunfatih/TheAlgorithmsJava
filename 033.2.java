package untitled1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        a dizisindeki tek sayıları b dizisinin başına çift sayıları b dizisinin sonuna atayan program
         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = new int[10];
        int size, p;
        size = 10;
        p = 0;


        for (int i = 0; i < size; i++)
            if (a[i] % 2 != 0) {
                b[p] = a[i];
                p ++;
            }
        for (int i = 0; i < size; i++)
            if (a[i] % 2 == 0) {
                b[p] = a[i];
                p++;
            }

        for (int i = 0; i < size; i++)
            System.out.print(b[i] + " ");
    }
}