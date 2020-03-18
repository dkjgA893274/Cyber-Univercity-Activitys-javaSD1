public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;
        
        for (int i=0; i<5; i++) {
            sum += arr[i];
        }
        
        System.out.println(sum);
    }
}