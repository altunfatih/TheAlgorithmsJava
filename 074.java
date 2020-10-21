import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        //         0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15  16 17 18 19
        int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
        klavyeden girilen sayıdan dizide kaç tane olduğunu bulan program
         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
        int n, count;
        System.out.print("Sayı giriniz: ");
        n = Integer.parseInt(scanner.nextLine());
        count = 0;

        for (int i = 0; i < a.length; i++)
            if (a[i] == n)
                count++;
        System.out.println(count);
    }
}