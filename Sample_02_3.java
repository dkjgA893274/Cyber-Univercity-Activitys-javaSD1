import java.util.Scanner;

public class Sample_02_3 {
    public static void main(String[] args) {
        int a = 5, b = 3;
        double x = 5.0, y;
        
        b = a - b;
        a = (a + 8) / b;
        y = a * x;
        
        System.out.println("y : " + y);
    }
}
