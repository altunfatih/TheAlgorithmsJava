public class Main {

    public static void main(String[] args) {
        /*
        Matrisin en büyük elemanını ekrana yazdıran program

        int m[][] =
                {{5, 7, 3},
                {15, 6, 10},
                {22, 9, 1},
                {11, 14, 18}};
         */

        int m[][] =
                 {{5, 7, 3},
                 {15, 6, 10},
                 {22, 9, 1},
                 {11, 14, 18}};

        int row, col, max;
        row = 4;
        col = 3;
        max = m[0][0];

        for (int i = 0; i < row; i++)
            for (int k = 0; k < col; k++)
                if (max < m[i][k])
                    max = m[i][k];
        System.out.println(max);
    }
}