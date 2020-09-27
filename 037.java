public class Main {

    public static void main(String[] args) {
        /*
        dizinin en büyük ve indis numarasını bulan program
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
         */

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size, max, count;
        size = 10;
        count = 1;
        max = a[0];

        for (int i = 1; i < size; i++) {
            if (a[i] > max) {
                max = a[i];
                count = i;
            }
        }

        System.out.println("Dizinin indis numarası: " + count);
        System.out.println("Dizinin en büyük elemanı: " + max);
    }
}