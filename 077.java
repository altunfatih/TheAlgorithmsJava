public class Main {

    public static void main(String[] args) {
        /*
        //         0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15  16 17 18 19
        int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
        int b[] = {8, 20, 30, 7, 45};
        b dizisindeki her elemanın a dizsinde olup olmadığını ekrana yazdıran program
         */

        int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
        int b[] = {8, 20, 30, 7, 45};
        int flag;

        for (int i = 0; i < b.length; i++) {
            flag = 0;
            for (int k = 0; k < a.length; k++)
                if (a[k] == b[i])
                    flag = 1;

            if (flag == 0)
                System.out.println(i + ". Yok");
            else
                System.out.println(i + ". Var");
        }
    }
}
