import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionTest3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try{
           System.out.print("2桁の整数値　>　");
           int n = scan.nextInt();
           if ((n <= 9) || (n >= 100)){
               throw new IllegalArgumentException();
           }
           System.out.print("入力した整数値 : " + n);
        } catch (InputMismatchException e) {
           System.out.println("例外：入力値は、整数値ではありませんでした。");
        } catch (IllegalArgumentException e) {
           System.out.println("例外：入力値は、2桁の整数値ではありませんでした。");
        } finally {
            System.out.println("終了しました。");
        }
    }
}