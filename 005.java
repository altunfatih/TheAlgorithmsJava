public static void main(String[] args) {
        // klavyeden girilen sayının 0 - 100 arasında olup olmadığını ekrana yazdıran program (0 ve 100 dahil degil)
        // 0 < n < 100 yazamazsın! İki koşul var 0 < n ve n < 100
        // mantıksal operatör kullanmayınız ( && - ||)

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Sayıyı giriniz= ");
        n = scanner.nextInt();

        if (0 < n)
        if (n < 100)
        System.out.println("0 ve 100 arasındadır");
        else
        System.out.println("0 ve 100 arasında değildir");
        else
        System.out.println("0 ve 100 arasında değildir");
        }