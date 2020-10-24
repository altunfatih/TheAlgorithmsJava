public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {1, 1, 1, 3, 5, 5, 8, 9, 17, 17, 17, 17, 20, 24, 24}
        diziyi her sayıdan 1 tane kalacak şekilde düzenleyen bu sayıları dizilerin başında biriktiren
        ve geri kalan elemanları sıfırlayan program
         */

        int a[] = {1, 1, 1, 3, 5, 5, 8, 9, 17, 17, 17, 17, 20, 24, 24};
        int size, p;
        size = 15;

        p = 1;
        for (int i = 1; i < size; i++)
            if (a[i] != a[i - 1]) {
                a[p] = a[i];
                p++;
            }

        for (int i = p; i < size; i++)
            a[i] = 0;

        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
}
