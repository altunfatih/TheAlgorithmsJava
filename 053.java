public class Main {

    public static void main(String[] args) {

        /*
            1 5 9
            2 6 10
            3 7 11
            4 8 12
         */

        int m[][] = new int[4][3];

        int row, col, count;
        row = 4;
        col = 3;
        count = 0;

        for (int i = 0; i < col; i++)
            for (int k = 0; k < row; k++) {
                count++;
                m[k][i] = count;
            }

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }
    }
}
