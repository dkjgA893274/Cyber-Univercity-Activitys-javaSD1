import java.util.Random;

public class Save {
    public static void main(String[] args) {
        Random rand = new Random();
        final int SIZE = 3;                       //サイコロを振る回数
        int[] date = new int[6];                    //出た目を記憶する箱                        
        
        for (int i=0; i<SIZE; i++) {  //サイコロを振った回数・ランダム生成の繰り返し条件内
            int dice = rand.nextInt(6) + 1;             //生成した乱数に"1"を足した数
            switch (dice) {
                case 1:
                    date[0] += 1;
                case 2:
                    date[1] += 1;                    
                case 3:
                    date[2] +=  1;
                case 4:
                    date[3] += 1;
                case 5:
                    date[4] += 1;
                case 6:
                    date[5] += 1;
            }
        }
        
        System.out.println("1：" + date[0]);
        int date1 = date[0];
        System.out.println("1：" + date1);

        System.out.println("2：" + date[1]);
        int date2 = date[1];
        System.out.println("2：" + date2);   
        
        
        System.out.println("3：" + date[2]);
        int date3 = date[2];
        System.out.println("3：" + date3);     
        
        
        System.out.println("4：" + date[3]);
        int date4 = date[3];
        System.out.println("4：" + date4);      
   
        
        System.out.println("5：" + date[4]);
        int date5 = date[4];
        System.out.println("5：" + date5);        
        
        
        System.out.println("6：" + date[5]);
        int date6 = date[5];
        System.out.println("6：" + date6);       
        
        
        
        
        
    }
}