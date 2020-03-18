import java.util.Scanner;

public class InputReal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("実数を入力してください。 > ");
        double realnumber = scan.nextDouble();
        
        System.out.println("入力した実数値：" + realnumber);
    }
}