public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
        Dizideki her sayıdan kaç tane olduğunu ekrana yazdıran program
         */
        int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
        int count, flag;

        for (int i = 0; i < a.length; i++) {
            flag = 0;
            for (int k = 0; k < i; k++)
                if (a[i] == a[k])
                    flag = 1;

            if (flag == 0) {
                count = 1;
                for (int k = i + 1; k < a.length; k++)
                    if (a[i] == a[k])
                        ++count;
                System.out.println(a[i] + " : " +  count);
            }
        }
    }
}
