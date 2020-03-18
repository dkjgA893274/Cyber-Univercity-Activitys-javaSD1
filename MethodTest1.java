import java.util.Scanner;

public class MethodTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("実数値１　＞　");
        double a = scan.nextDouble();
        
        System.out.print("実数値２　＞　");
        double b = scan.nextDouble();
        
        System.out.print("実数値３　＞　");
        double c = scan.nextDouble();
        
        double min = minOf(a, b, c);
        System.out.println("最小値：" + min);
    } 

    public static double minOf(double x, double y, double z) {
        double min = x;
        if (y < min) {
            min = y;
        }
        if (z < min) {
            min = z;
        }
        
        return min;
    }
}