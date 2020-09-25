import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        klavyeden girilen 3 kenar uzunluğu bir üçgen oluşturup oluşturmadığını ekrana yazdıran program
        a + b > c
        a + c > b
        b + c > a
        Bu 3 koşul sağlanmalı!
         */

        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("a: ");
        a = input.nextInt();
        System.out.print("b: ");
        b = input.nextInt();
        System.out.print("c: ");
        c = input.nextInt();

        if ((a + b) > c)
            if ((a + c) > b)
                if ((b + c) > a)
                    System.out.println("Üçgendir");
                else
                    System.out.println("Üçgen Değildir");
            else
                System.out.println("Üçgen Değildir");
        else
            System.out.println("Üçgen Değildir");
    }
}
