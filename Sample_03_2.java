import java.util.Scanner;

public class Sample_03_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("身長（cm） > ");
        double height = scan.nextDouble();
       
        System.out.print("体重（kg） > ");
        double weight = scan.nextDouble();
        
        height = height/100.0;
        double stdWeight = height * height * 22.0;
        double diff = weight - stdWeight;
        
        if(diff < -10) {
            System.out.println("Underweight.");
        } else if (diff <= 10) {
            System.out.println("Normal.");
        } else {
            System.out.println("Overweight.");
        }
    }
}