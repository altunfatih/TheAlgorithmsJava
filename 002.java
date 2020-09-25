public static void main(String[] args) {
        // klavyeden girilen sayının mutlak değerini hesaplayan program

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = scanner.nextInt();

        if (a < 0)
        a = (a * -1);

        System.out.println(a);

}