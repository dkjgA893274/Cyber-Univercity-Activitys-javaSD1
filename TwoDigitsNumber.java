import java.util.Scanner;

public class TwoDigitsNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("整数値を入力してください > ");
        int num = scan.nextInt();
       
        if((10 <= num) && (num < 100)){
            System.out.println("2桁の整数値です。");
        } else {
            System.out.println("2桁の整数値ではありません。");
        }
    }
}