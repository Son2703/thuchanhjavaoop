import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương a = ");
        int a = abc.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = abc.nextInt();
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
    }
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
}