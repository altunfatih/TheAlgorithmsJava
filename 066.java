public class Main {

    public static void main(String[] args) {
        /*
        1 0 0 0 0 0 0 0 0 0 0 0 0 0 1
        0 1 0 0 0 0 0 0 0 0 0 0 0 1 0
        0 0 1 0 0 0 0 0 0 0 0 0 1 0 0
        0 0 0 1 0 0 0 0 0 0 0 1 0 0 0
        0 0 0 0 1 0 0 0 0 0 1 0 0 0 0
        0 0 0 0 0 1 0 0 0 1 0 0 0 0 0
        0 0 0 0 0 0 1 0 1 0 0 0 0 0 0
        0 0 0 0 0 0 0 1 0 0 0 0 0 0 0
        0 0 0 0 0 0 1 0 1 0 0 0 0 0 0
        0 0 0 0 0 1 0 0 0 1 0 0 0 0 0
        0 0 0 0 1 0 0 0 0 0 1 0 0 0 0
        0 0 0 1 0 0 0 0 0 0 0 1 0 0 0
        0 0 1 0 0 0 0 0 0 0 0 0 1 0 0
        0 1 0 0 0 0 0 0 0 0 0 0 0 1 0
        1 0 0 0 0 0 0 0 0 0 0 0 0 0 1
         */

        int m[][] = new int[15][15];

        int row, col;
        row = 15;
        col = 15;

        for (int i = 0; i < row; i++) {
            m[i][i] = 1;
            m[i][col - 1 - i] = 1;
        }

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }
    }
}