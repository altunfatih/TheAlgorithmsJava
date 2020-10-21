public class Main {

    public static void main(String[] args) {
        /*
        Matrisin toplamını ve ortalamasını ekrana yazdıran program

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

        int row, col, sum, avg;
        row = 4;
        col = 3;
        sum = 0;

        for (int i = 0; i < row; i++)
            for (int k = 0; k < col; k++)
                sum = sum + m[i][k];

        avg = sum / (row * col);

        System.out.println(sum);
        System.out.println(avg);
    }
}