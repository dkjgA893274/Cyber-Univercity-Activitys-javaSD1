public class ForTest3 {
    public static void main(String[] args) {
        int n = 10;
        
        for (int i = 1; i<=n; i++){
            if (i%3 == 0) {
            continue;
        }
        if (i == 6) {
            break;
        }
        System.out.print(i + " ");
        }
    }
}