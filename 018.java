public class Main {

    public static void main(String[] args) {
        /*
        1 ile 100 arasındaki 3, 4 ve 5' in katlarını ekrana iç içe yazdıran program
        örneğin: 3 4 5 6 8 9 10 12 12 15 15 16 18 20 20 21
        ancak 1 sayı 1 kere yazdırılmalı
         */

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0)
                System.out.println(i);
            else if (i % 4 == 0)
                System.out.println(i);
            else if (i % 5 == 0)
                System.out.println(i);
        }
    }
}