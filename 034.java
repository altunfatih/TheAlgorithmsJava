public class Main {

    public static void main(String[] args) {
        /*
        a dizisi içerisinde teklerı başa çiftleri sona atayan program
        2. dizi kullanmayınız.
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
         */

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size, po, pe;
        size = 10;
        po = 0;

        for (int i = 0; i < size; i++)
            if (a[i] % 2 != 0) {
                pe = a[po];
                a[po] = a[i];
                po++;
                a[i] = pe;
            }

        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
}
