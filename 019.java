import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        klavyeden x ve y giriliyor. x'in y'den küçük olduğu kabul ediliyor.
        x < y
        x'ten büyük y'den küçük dizi elemanlarını ekrana yazdıran program
        örneğin x = 6, y = 12 giirilidğinde ekrana 8 ve 9 yazdıralacak...
         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        int x, y, size;
        size = 10;

        System.out.print("x i giriniz: ");
        x = scanner.nextInt();
        System.out.print("y i giriniz: ");
        y = scanner.nextInt();

        for (int i = 0; i < size; i++)
            if (a[i] > x)
                if (a[i] < y)
                    System.out.println(a[i]+ " ");
    }
}
