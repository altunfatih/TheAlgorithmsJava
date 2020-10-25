public class Main {

    public static void main(String[] args) {
        /*
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17}
        Dizinin ortalammasına en yakın dizi elemanını bulan program
         */

        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, avg, sum, n ,minDif, tempDif;

        sum = 0;
        for (i = 0; i < a.length; i++)
            sum = sum + a[i];
        avg = sum / a.length;

        n = a[0];
        minDif = avg - a[0];
        if (minDif < 0)
            minDif = - minDif;

        for (i = 0; i < a.length; i++) {
            tempDif = avg - a[i];
            if (tempDif < 0)
                tempDif = -tempDif;
            if (tempDif < minDif) {
                minDif = tempDif;
                n = a[i];
            }
        }

        System.out.println("Dizinin ortalaması: " + avg + " En yakın eleman: " + n);
    }
}
