import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        klavyeden girilen 3 farklı sayının en büyüğünü ekrana yazdıran program
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
            if (a > c)
                System.out.println("En büyük sayı a: " + a);
            else
                System.out.println("En büyük sayı c: " + c);
        else
        if (b > c)
            System.out.println("En büyük b: " + b);
        else
            System.out.println("En büyük c: " + c);
    }
}