public static void main(String[] args) {
        // klavyeden girilen x e göre y nin ve z nin değerini ekrana yazdıran program
        // x<0 -> y = (x*x) + 2x || z = 3 * x
        // x>0 -> y = x  ||  z = (x*x) + 10

        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        System.out.print("X Sayısını giriniz: ");
        x = scanner.nextInt();

        if (x<0) {
        y = x * x + 2 * x;
        z = 3 * x;
        }
        else {
        y = x;
        z = x * x + 10;
        }
        System.out.println("Y = " + y + " || Z = " + z);
        }