import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        a dizisini kendi içinde tersine çeviren program, ikinci bir dizi yok
        int a[] = {17, 5, 20, 21, 9, 18, 1, 3, 8, 4};
         */

        Scanner scanner = new Scanner(System.in);

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size, temp;
        size = 10;

        for (int i = 0; i < size / 2; i++) {
            temp = a[i];
            a[i] = a[size - i - 1];
            a[size - i - 1] = temp;
        }
        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
} 
