public class Main {

    public static void main(String[] args) {
        /*
            Bubble Sort
         */

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int temp, size;
        size = 10;

        for (int i = 0; i < size - 1; i++)
            for (int k = 0; k < size - 1 - i; k++)
                if (a[k] > a[k + 1]) {
                    temp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                }

        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
}

