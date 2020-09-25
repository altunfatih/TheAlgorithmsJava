import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         klavyeden a ve b giriliyor
         a < b
         a = b
         a > b
         olabilir. Her durumda a'dan b'ye kadar olan sayıları ekrana yazdıran program
         */
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("A yı giriniz: ");
        a = scanner.nextInt();
        System.out.print("B yi giriniz: ");
        b = scanner.nextInt();

        if (a < b)
            for (int i = a; i <= b; i++)
                System.out.println(i);
        else
            for (int i = a; i >= b; i--)
                System.out.println(i);

    }
}