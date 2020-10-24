public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = {8, 13, 6, 12, 4, 5, 19, 1, 14, 25};
        2 dizinin birleşimini ekrana yazdıran program (ortak eleman 1 kere yazdırılacak)
         */

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = {8, 13, 6, 12, 4, 5, 19, 1, 14, 25};
        int flag, size;
        size = 10;

        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
            flag = 0;
            for (int k = 0; k < size; k++)
                if (b[i] == a[k])
                    flag = 1;
            if (flag == 0)
                System.out.print(b[i] + " ");
        }
    }
}
