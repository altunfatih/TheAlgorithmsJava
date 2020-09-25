public static void main(String[] args) {
        // klavyeden girilen 2 basamaklı bir sayının
        // basamklarının karelerinin toplamını ekrana yazdıran program

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number = input.nextInt();
        int a;
        int b;

        if ((number / 10) < 10 ) { // 3 basamaklı olup olmadığı kontrol ediliyor
        a = number % 10;
        b = number / 10;
        System.out.println("Karalerin toplamı = " + ((a*a)+(b*b)));
        }
        else {
        System.out.println("Sayı 3 basamaklıdır!!");
        }
}