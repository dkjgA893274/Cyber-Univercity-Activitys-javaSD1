import java.util.Scanner;

public class Sample_14_14 {
    public static void main(String[] args) {
        try{
           int num = inputNum();
           System.out.println("入力値 : " + num);
        } catch (IllegalArgumentException e) {
           System.out.println("例外：入力値は、正の整数値ではありませんでした。");
        }
    }
    
    public static int inputNum() throws IllegalArgumentException {
        Scanner scan = new Scanner(System.in);
        
           System.out.print("正の整数 n > ");
           int n = scan.nextInt();
           if (n <= 0) {
               throw new IllegalArgumentException();
           }

        return n;
    }
}