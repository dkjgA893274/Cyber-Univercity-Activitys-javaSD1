import java.util.Random;

public class Ex_08_4_1601010010 {
    public static void main(String[] args) {
        Random rand = new Random();
        int max = 200;
        int[] date = new int[6];                                          

        for (int i=0; i<max; i++) { 
            int dice = rand.nextInt(6) + 1; 
            switch (dice) {
                case 1:
                    date[0] = date[0] + 1;
                    break;
                case 2:
                    date[1] = date[1] + 1;
                    break;
                case 3:
                    date[2] = date[2] + 1;
                    break;
                case 4:
                    date[3] = date[3] + 1;
                    break;
                case 5:
                    date[4] = date[4] + 1;
                    break;
                case 6:
                    date[5] = date[5] + 1;
                    break;
            }
        }
        System.out.print("1：");
        int date1 = date[0];
        for (int j=0; j<date1; j++) {
                    System.out.print("*");
        }
        
        System.out.println();
        System.out.print("2：");
        int date2 = date[1];
        for (int k=0; k<date2; k++) {
                    System.out.print("*");
        }        
        
        System.out.println();
        System.out.print("3：");
        int date3 = date[2];
        for (int l=0; l<date3; l++) { 
                    System.out.print("*");
        }
        
        System.out.println();
        System.out.print("4：");
        int date4 = date[3];
        for (int m=0; m<date4; m++) { 
                    System.out.print("*");
        }
        
        System.out.println();
        System.out.print("5：");
        int date5 = date[4];
        for (int n=0; n<date5; n++) { 
                    System.out.print("*");
        }
        
        System.out.println();
        System.out.print("6：");
        int date6 = date[5];
        for (int o=0; o<date6; o++) { 
                    System.out.print("*");
        }
                    System.out.println();
    }
}