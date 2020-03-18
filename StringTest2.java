import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("文字列 >;");
        String str = scan.next();
        
        int n = str.length();
        System.out.println("入力した文字列は" + n + "文字です");
    }
}