import java.util.Scanner;

public class Ex_08_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("文字列 > ");
        String str1 = scan.nextLine();
        
        int letters = str1.length();
        System.out.println("文字数：" + letters);
        
        String str2 = str1.toLowerCase();
            System.out.println("変換後：" + str2);
    }
}