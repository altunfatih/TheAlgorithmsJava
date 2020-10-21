public class Main {

    public static void main(String[] args) {
        /*
        1 0 0 0 0
        2 3 0 0 0
        4 5 6 0 0
        7 8 9 10 0
        11 12 13 14 15
         */

        int m[][] = new int[5][5];
        int row, col, count;

        row = 5;
        col = 5;
        count = 0;

        for (int i = 0; i < row; i++)
            for (int k = 0; k <= i; k++) {
                count++;
                m[i][k] = count;
            }

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }
    }
}