public class Main {

    public static void main(String[] args) {
        /*
        dizinin en küçük elemanını ve dizinin ilk elemanıyla yer değiştiren program
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
         */

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size, min, p;
        size = 10;

        min = a[0];
        p = 0;

        for (int i = 1; i < size; i++)
            if (a[i] < min) {
                min = a[i];
                p = i;
            }
        a[p] = a[0];
        a[0] = min;

        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
}