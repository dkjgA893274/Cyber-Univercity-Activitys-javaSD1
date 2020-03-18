import java.util.Scanner;

public class Sample_14_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try{
           System.out.print("整数値 a　>　");
           int a = scan.nextInt();
           System.out.print("整数値 b　>　");
           int b = scan.nextInt();
            
           int c = a/b;
           System.out.println(" a / b　：　" + c);
        } catch (RuntimeException e) {
           System.out.println("例外：RumtimeExceptionが発生しました。");
        } 
    }
}