import java.util.Scanner;

public class Sample_05_4 {
    public static void main(String[] srgs) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("何段？ > ");
        int num = scan.nextInt();
        
        for (int i=1; i<=num; i++) {
            for ( int j=1; j<=i; j++) {
                System.out.print("+");
                
            }
            System.out.println();
        }
    }
}