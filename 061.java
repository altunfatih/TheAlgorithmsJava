public class Main {

    public static void main(String[] args) {
        /*
        Matrisin en büyük elemanını ve yerini bulan program

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

        int row, col, max, countRow, countCol;
        row = 4;
        col = 3;
        max = m[0][0];
        countCol = 0;
        countRow = 0;

        for (int i = 0; i < row; i++)
            for (int k = 0; k < col; k++)
                if (max < m[i][k]) {
                    max = m[i][k];
                    countRow = i;
                    countCol = k;
                }

        System.out.println("Satır no: " + countRow + " Sütun no: " + countCol);
        System.out.println("Matrisin en büyük elemanı: " + max);
    }
}