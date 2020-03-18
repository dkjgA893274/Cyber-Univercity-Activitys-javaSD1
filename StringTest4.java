import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("文字列1 > ");
        String str1 = scan.next();
        
        System.out.print("文字列2 > ");
        String str2 = scan.next();        
        
        if (str2.equals(str1)) {
           System.out.println("2つの文字列の内容は同じです。");
        } else {
            System.out.print("2つの文字列の内容は異なります。");
        }
    }
}