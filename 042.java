public class Main {

    public static void main(String[] args) {

        /*
            int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
            Dizinin her elemanını kendisi defa yazdıran program
         */

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size;
        size = 10;

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < a[i]; k++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}
