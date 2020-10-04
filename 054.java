public class Main {

    public static void main(String[] args) {

        /*
            1 2 3
            1 2 3
            1 2 3
            1 2 3

            1. satır satır erişilecek
            2. count kullanılacak
         */

        int m[][] = new int[4][3];

        int row, col, count;
        row = 4;
        col = 3;
        count = 0;

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                count++;
                m[i][k] = count;
            }
            count = 0;
        }


        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }
    }
}
