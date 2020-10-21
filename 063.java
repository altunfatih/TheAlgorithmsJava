public class Main {

    public static void main(String[] args) {
        /*
        Her sütunun en büyük elemanını ayrı ayrı ekrana yazdıran program

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


        for (int i = 0; i < col; i++) {
            max = m[0][i];
            for (int k = 0; k < row; k++)
                if (max < m[k][i])
                    max = m[k][i];
            System.out.println(i + " nolu satırın en büyüğü: " + max);
        }
    }
}