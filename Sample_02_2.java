import java.util.Scanner;

public class Sample_02_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double height, weight;
        
        System.out.print("身長(cm) > ");
        height = scan.nextDouble();
        
        height = height / 100.0;
        weight = height * height * 22.0;
        System.out.println("標準体重 : " + weight + "kg");
    }
}
