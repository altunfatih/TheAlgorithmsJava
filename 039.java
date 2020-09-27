public class Main {
    
    public static void main(String[] args) {
        /*
        selection sort
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
         */

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size, min, p;
        size = 10;

        for (int k = 0; k < size - 1; k++) {
            min = a[k];
            p = k;

            for (int i = k + 1; i < size; i++)
                if (a[i] < min) {
                    min = a[i];
                    p = i;
                }
            a[p] = a[k];
            a[k] = min;

            for (int i = 0; i < size; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }

    }
}