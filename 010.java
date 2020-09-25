import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        ikizkenar üçgen -> ancak eşkenar üçgen, ikizkenar üçgen kabul edilmeyecektir
         */

        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("a: ");
        a = input.nextInt();
        System.out.print("b: ");
        b = input.nextInt();
        System.out.print("c: ");
        c = input.nextInt();

        if (a == b)
            if (a != c)
                System.out.println("İkizkenardır");
            else
                System.out.println("İkizkenar Değildir");
        else
        if (a == c)
            System.out.println("İkizkenardır");
        else
        if (b == c)
            System.out.println("İkizkenardır");
        else
            System.out.println("İkizkenar Değildir");
    }
}