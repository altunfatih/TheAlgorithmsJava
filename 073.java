import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Klavyen girilen sayıyının basamaklarından elde edilebilecek en büyük sayıyı bulan program
        7235 -> 7532
         */

        Scanner scanner = new Scanner(System.in);

        int n, digit, newn, p, temp;
        int a[] = new int[10];
        p = 0;

        System.out.print("Sayı giriniz: ");
        n = Integer.parseInt(scanner.nextLine());

        // basamaklar elde ediliyor ve diziye atanıyor
        while (n != 0) {
            digit = n % 10;
            a[p] = digit;
            p++;
            n = n/10;
        }

        // basamaklar büyükten küçüğe sıralanıyor
        for (int i = 0; i < p - 1; i++)
            for (int k = 0; k < p - 1 - i; k++)
                if (a[k] < a[k + 1]) {
                    temp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                }

        // yeni sayı oluşturuluyor
        newn = a[0];
        for (int i = 1; i < p; i++) {
            newn = newn * 10 + a[i];
        }
        System.out.println(newn);
    }
}