public class Main {

    public static void main(String[] args) {
        /*
        dizinin en büyük ve en küçük elamanını bulan program
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
         */

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size, max, min;
        size = 10;

        min = a[0];
        max = a[0];

        for (int i = 0; i < size; i++)
            if (a[i] > max)
                max = a[i];
            else if (a[i] < min)
                min = a[i];

        System.out.println("Dizinin en küçük elemanı: " + min);
        System.out.println("Dizinin en büyük elemanı: " + max);
    }
}