import java.util.Scanner;

class JavaStaticInitializerBlock {

    public static int B;
    public static int H;
    public static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        scanner.nextLine();
        H = scanner.nextInt();
        if (B > 0 && B <= 100 && H > 0 && H <= 100) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }
}