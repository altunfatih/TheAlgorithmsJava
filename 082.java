public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {4, 8, -3, -1, 18, 9, -21, 20, 5, -17}
        Dizinin en büyük negatif elemanını bulan program
         */

        int a[] = {4, 8, -3, -1, 18, 9, -21, 20, 5, -17};
        int min = a[0];
        int i = 0;

        while (a[i] >= 0)
            ++i;

        min = a[i];

        for (i = i + 1; i < a.length; i++)
            if (a[i] < 0)
                if (min < a[i])
                    min = a[i];

        System.out.println(min);
    }
}
