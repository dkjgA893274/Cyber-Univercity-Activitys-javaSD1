public class maxOf2Int {
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int big = maxOf2Int(x, y);
        System.out.println(big);
    }

        

public static int maxOf2Int(int x, int y) {
    if (x < y) {
        return y;
    } else {
        return x;
    }
}



}
