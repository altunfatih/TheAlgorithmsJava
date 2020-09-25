public static void main(String[] args) {
        // klavyeden girilen 0 - 1000 arasındaki sayının basamak sayısını ekrana yazdıran program
        // sayı 0 ve 1000 arasında girildiği kabul edilecektir

        Scanner scanner = new Scanner(System.in);
        int n, count;
        System.out.print("0 - 1000 arasında bir sayı giriniz: ");
        n = scanner.nextInt();

        if (n < 10)
        System.out.println("Tek basamaklıdır");
        else
        if (n < 100)
        System.out.println("İki basamaklıdır");
        else
        System.out.println("3 basamaklıdır");
        }