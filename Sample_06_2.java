public class Sample_06_2 {
    public static void main(String[] args) {
        final int SIZE = 5;
        final int SUBJ = 3;
        int[][] score = new int[SIZE][SUBJ];
        
        for (int i=0; i<SIZE; i++) {
            score[i][0] = (i*83 +15) % 101;
            score[i][1] = (i*83 +15) % 101;
            score[i][2] = (i*83 +15) % 101;
        }
        
        for (int i=0; i<SIZE; i++) {
            int total = 0;
            for (int j=0; j<SUBJ; j++) {
                total += score[i][j];
            }
            System.out.println("学生#" + i + " : " + total);
        }
    }
}