import java.util.Scanner;
import java.io.*;

public class Sample_15_7 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         System.out.print("ファイル名　>　");
         String filename = scan.next();
         
        try{
           //ファイル出力の準備//
           FileWriter fw = new FileWriter(filename); //FileNotFoundExceptionの可能性
           BufferedWriter bw = new BufferedWriter(fw);
           PrintWriter pw = new PrintWriter(bw);
            
            //ファイル出力の処理//
           for (int i=1; i <=100; i++) {
               pw.printf("%4d\n", i*100);
               System.out.printf("%4d\n",i*100);
           }

            //ファイル出力の終了//
            pw.close();
        } catch (IOException e) {
            System.out.println("入出力エラーが発生しました。");
        }
     }
}