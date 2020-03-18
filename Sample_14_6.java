import java.util.Scanner;
import java.io.*;

public class Sample_14_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ファイル名 > ");
        String filename = scan.next();
        
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        
        String line;
        while ((line = br.readLine()) := null) {
            System.out.println(line);
        }
        br.close();
    }
}