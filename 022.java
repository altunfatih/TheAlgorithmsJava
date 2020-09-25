public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        dizinin ortalamasından küçük dizi elemanlarını ekrana yazdıran program
         */
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        int size, avg, sum;
        sum = 0;
        size = 10;

        for (int i = 0; i < size; i++)
            sum = a[i] + sum;
        avg = sum / size;

        for (int i = 0; i < size; i++)
            if (a[i] < size)
                System.out.println(a[i]);
    }
}