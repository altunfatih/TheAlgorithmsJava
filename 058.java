public class Main {

    public static void main(String[] args) {
        /*
        Her sütunun toplamını ve ortalamasını ekrana ayrı ayrı yazdıran program

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

        for (int i = 0; i < col; i++) {
            for (int k = 0; k < row; k++)
                sum = sum + m[k][i];
            avg = sum / row;
            System.out.println(i + ". nolu satırın toplamı: " + sum + " Ortalaması: " + avg);
            sum = 0;
        }
    }
}