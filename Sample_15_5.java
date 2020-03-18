import java.util.Scanner;
import java.io.*;

public class Sample_15_4 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         System.out.print("ファイル名　>　");
         String filename = scan.next();
         
        try{
           //ファイル入力の準備//
           FileReader fr = new FileReader(filename); //FileNotFoundExceptionの可能性
           BufferedReader br = new BufferedReader(fr);
            
            //ファイル入力の処理//
            String line;
            while ((line = br.readLine()) != null) {  //IOExceptionの可能性
                System.out.println(line);
            }
            
            //ファイル入力の終了//
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ファイル" + filename + "見つかりませんでした。");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("入出力エラーが発生しました。");
        }
     }
}