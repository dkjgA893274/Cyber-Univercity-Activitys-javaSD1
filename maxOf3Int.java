public class maxOf3Int {
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int z = 3;
        int big = maxOf3Int(x, y, z);
        System.out.println(big);
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
    
    
    
}