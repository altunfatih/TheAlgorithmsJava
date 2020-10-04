public class Main {

    public static void main(String[] args) {

        /*
         dizinin her elemanı kadar yıldız bastıracak
          4 ****
          8 ********
          3 ***
          1 *
         18 ******.....
         Birler basamağı alt alta gelecek

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
         */

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 10)
                System.out.print(" ");
            System.out.print(a[i] + " ");
            for (int k = 0; k < a[i]; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
