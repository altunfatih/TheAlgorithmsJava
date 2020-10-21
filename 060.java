package com.altunfatih;

public class Main {

    public static void main(String[] args) {
        /*
        Matrisin en büyük ve en küçük elemanını ekrana yazdıran program

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

        int row, col, max, min;
        row = 4;
        col = 3;
        max = m[0][0];
        min = m[0][0];

        for (int i = 0; i < row; i++)
            for (int k = 0; k < col; k++)
                if (max < m[i][k])
                    max = m[i][k];
                else if (min > m[i][k])
                    min = m[i][k];

        System.out.println(min);
        System.out.println(max);
    }
}