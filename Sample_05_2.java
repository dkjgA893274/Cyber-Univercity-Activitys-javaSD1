import java.util.Scanner;

public class Sample_05_2 {
    public static void main(String[] srgs) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("正の整数 > ");
        int number = scan.nextInt();
        
        int digit = 0;
        while (number > 0) {
            number /= 10;
            digit++;
        }
        
        System.out.println(digit + "桁の整数です。");
    }
}
