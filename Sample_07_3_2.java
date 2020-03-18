import java.util.Scanner;

public class Sample_07_3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("文字列 > ");
        String str = scan.nextLine();
        
        char[] chArr = str.toCharArray();
        for (int i=chArr.length-1; i>=0; i--) {
            System.out.print(chArr[i]);
        }
        System.out.println();
    }
}
                