import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //klavyeden girilen x e göre y nin değerini ekrana yazdıran program
        /*
        y = k * x + t;
        x < 0           -> k = 2  || t = 0
        0 =< x =< 5     -> k = -1 || t = 10
        x > 8           -> k = 3  || t = -20
        y = ?
         */

        Scanner input = new Scanner(System.in);
        int x, y, k = 0, t = 0;

        System.out.print("X i giriniz: ");
        x = input.nextInt();

        if (x < 0) {
            k = 2;
            t = 0;
        }
        else {
            if (x <= 5) {
                k = -1;
                t = 10;
            }
            else {
                k = 3;
                t = -20;
            }
        }
        y = k * x + t;
        System.out.println(y);
    }
}
