public class Ex_06_1 {
    public static void main(String[] args){
        final int SIZE = 5;
        final int SUBJ = 3;
        int[][] score = new int[SIZE][SUBJ];

        for (int i=0; i<SIZE; i++) {
            score[i][0] = (i*83 + 15) % 101; 
            score[i][1] = (i*79 + 14) % 101; 
            score[i][2] = (i*57 + 18) % 101; 
        }

        for (int i=0; i<SIZE; i++) {
            System.out.println("\nw¶#" + i);
            System.out.print("ÈÚA: " + score[i][0] + ", ");
            System.out.print("ÈÚB: " + score[i][1] + ", ");
            System.out.println("ÈÚC: " + score[i][2]);

            int total = 0;
            for (int j=0; j<SUBJ; j++) {
                total += score[i][j];
            }

            System.out.println("v_: " + total);
            System.out.printf("½Ï_: %.1f\n", (double)total / SUBJ);
        }
    }
}
