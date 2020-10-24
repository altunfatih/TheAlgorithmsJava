public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {17, 1, 1, 5, 24, 8, 9, 5, 17, 1, 20, 24, 17, 3, 17}
        diziyi her sayıdan 1 tane kalacak şekilde düzenleyen bu sayıları dizilerin başında biriktiren
        ve geri kalan elemanları sıfırlayan program
         */

        int a[] = {17, 1, 1, 5, 24, 8, 9, 5, 17, 1, 20, 24, 17, 3, 17};
        int size, p, flag;
        size = 15;

        p = 1;
        for (int i = 1; i < size; i++) {
            flag = 0;
            for (int k = 0; k < i; k++)
                if (a[i] == a[k])
                    flag = 1;

            if (flag == 0) {
                a[p] = a[i];
                p++;
            }
        }

        for (int i = p; i < size; i++)
            a[i] = 0;

        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
}
