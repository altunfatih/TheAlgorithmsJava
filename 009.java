import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        klavyeden girilen 3 kenar uzunluğu eşkenar üçgen oluşturup oluşturmadığını ekrana yazdıran program
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
            if (b == c)
                System.out.println("Eşkanar Üçgen");
            else
                System.out.println("Eşkenar Üçgen Değildir");
        else
            System.out.println("Eşkenar Üçgen Değildir");
    }
}