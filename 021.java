import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        klavyeden n giriliyor. n den küçük tek ve çift elemanları ayrı ayrı toplamını ekrana yazdıran program
         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        int n, size, sumOdd, countOdd, sumEven, countEven;
        size = 10;
        sumEven = 0;
        sumOdd = 0;
        countEven = 0;
        countOdd = 0;

        System.out.print("n 'yi giriniz: ");
        n = scanner.nextInt();

        for (int i = 0; i < size; i++)
            if (a[i] < n)
                if (a[i] % 2 != 0) {
                    countOdd++;
                    sumOdd = a[i] + sumOdd;
                    System.out.println("Tek sayılar: " + a[i]);
                }
                else {
                    countEven++;
                    sumEven= a[i] + sumEven;
                    System.out.println("Çift sayılar: " + a[i]);
                }
        System.out.println("Teklerin toplamı: " + sumOdd + " - Adeti: " + countOdd);
        System.out.println("Çiftlerin toplamı: " + sumEven + " - Adeti: " + countEven);
    }
}