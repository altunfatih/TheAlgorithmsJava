public class Main {

    public static void main(String[] args) {

        /*
            int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
            1. elemanı 1 kere
            2. elemanı 2 kere
            3. elemanı 3 kere
            .           .
            .           .
         */

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size;
        size = 10;

        for (int i = 0; i < size + 1; i++) {
            for (int k = 0; k < i; k++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}
