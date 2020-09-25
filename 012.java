import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Klavyeden girilen 3 farklı sayının ortancısını ekrana yazdıran program
         */

        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("a: ");
        a = input.nextInt();
        System.out.print("b: ");
        b = input.nextInt();
        System.out.print("c: ");
        c = input.nextInt();

        if (a > b)
            if (c > a)
                System.out.println("Ortancı sayı a: " + a);
            else
            if (b > c)
                System.out.println("Ortancı sayı b: " + b);
            else
                System.out.println("Ortancı sayı c: " + c);
        else
        if (c > b)
            System.out.println("Ortancı sayı b: " + b);
        else
        if (a > c)
            System.out.println("Ortancı sayı a: " + a);
        else
            System.out.println("Ortancı sayı c: " + c);

    }
}
