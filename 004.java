public static void main(String[] args) {
        // klavyeden a ve b giriliyor a > b || a = b || a < b olabilir
        // a ile b arasındaki büyüklük ilişkisini ekrana yazdıran program

        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("A sayısını giriniz= ");
        a = scanner.nextInt();
        System.out.print("B sayısını giriniz= ");
        b = scanner.nextInt();

        if (a > b)
        System.out.println(a + " > " + b);
        else
        if (a == b)
        System.out.println(a + " = " + b);
        else
        System.out.println(a + " < " + b);
        }