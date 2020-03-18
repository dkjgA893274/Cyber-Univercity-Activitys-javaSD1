public class ArrayTest6 {
    public static void main (String arg[]) {
        int[] a = {10,20,30};
        int[][] b = new int[2][3];
        
        for (int i=0; i<3; i++) {
            b[0][i] = a[i];
        }
        
        int sum = b[0][1] + b[1][1];
        
        System.out.println(sum);
    }
}