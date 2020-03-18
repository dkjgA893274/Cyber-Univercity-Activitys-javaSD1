import java.util.Scanner;

public class Sample_05_3 {
    public static void main(String[] srgs) {
        Scanner scan = new Scanner(System.in);
        
        int number;
        do {
            System.out.print("正の整数 > ");
            number = scan.nextInt();
        }while(number <= 0);
            
        int digit = 0;
        while (number > 0) {
            number /= 10;
            digit++;
        }
        
        System.out.println(digit + "桁の整数です。");
    }
}