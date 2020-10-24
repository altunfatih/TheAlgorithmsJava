public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = {8, 13, 6, 12, 4, 5, 19, 1, 14, 25};
        2 dizinin kesişimini ekrana yazdıran program
         */

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = {8, 13, 6, 12, 4, 5, 19, 1, 14, 25};

        for (int i = 0; i < a.length ; i++)
            for (int k = 0; k < b.length; k++)
                if (a[i] == b[k])
                    System.out.print(a[i] + " ");
    }
}
