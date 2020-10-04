public class Main {

    public static void main(String[] args) {

        /*
            1 1 1
            2 2 2
            3 3 3
            4 4 4

            1. satır satır erişilecek
            2. count kullanılacak
         */

        int m[][] = new int[4][3];

        int row, col, count;
        row = 4;
        col = 3;
        count = 0;

        for (int i = 0; i < row; i++) {
            count++;
            for (int k = 0; k < col; k++) {
                m[i][k] = count;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }
    }
}
