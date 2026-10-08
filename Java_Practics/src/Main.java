import java.util.Scanner;
import java.lang.Math;

class Main {
    public static double square(double x) {
        return Math.pow(x, 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(square(num));
    }
}
