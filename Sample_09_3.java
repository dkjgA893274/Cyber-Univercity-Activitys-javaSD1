public class Sample_09_3 {
    public static void main(String[] args) {
        int a = 43;
        int b = 18;
        int c = 72;
        int[] d = {33, 49, 82, 24, 65};
        
        int max1 = maxOf2Int(a, b);
        System.out.println("変数 a, b の最大値：" + max1);
        
        int max2 = maxOf3Int(a, b, c);
        System.out.println("変数 a, b, c の最大値：" + max2);
        
        int max3 = maxOfArr(d);
        System.out.println("配列 d の最大値：" + max3);
    }

    
    public static int maxOf2Int(int x, int y) {
    if (x < y) {
        return y;
    } else {
        return x;
    }
}
    
    
    public static int maxOf3Int(int x, int y, int z) {
    if (x < y) {
         if (y < z) {
             return z;
         } else {
             return y;
         }
    } else {
        if (x < z) {
            return z;
        } else {
            return x;
        }
    }
}
    
    
    public static int maxOfArr(int[] arr) {
        int max = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    
    
}