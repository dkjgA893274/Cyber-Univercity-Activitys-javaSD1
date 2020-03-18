import java.util.Scanner;
import java.util.InputMismatchException;

public class Sample_14_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try{
           System.out.print("整数値 a　>　");
           int a = scan.nextInt();
           System.out.print("整数値 b　>　");
           int b = scan.nextInt();
            
           int c = a/b;
           System.out.println(" a / b　：　" + c);
        } catch (InputMismatchException e) {
           System.out.println("例外：入力値は整数値ではありませんでした。");
        } catch (ArithmeticException e) {
           System.out.println("例外：0で割る演算です。");
        } finally {
            System.out.println("終了しました。");
        }
    }
}