import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        klavyeden a ve b giriliyor. a, b'den küçük (a < b).
        a ile b'nin arasındaki 5'in katlarını ekrana yazdıran program
        a ve b dahil değil
         */

        int a, b, n;
        n = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a giriniz: ");
        a = scanner.nextInt();
        System.out.print("b giriniz: ");
        b = scanner.nextInt();

        for (int i = a + (n - a % n); i < b; i = i + n)
            System.out.println(i);

    }
}