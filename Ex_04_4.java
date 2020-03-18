public class Ex_04_4 {
    public static void main(String[] args) {
        int a = 2, b = 3;
        
        if (a >= b) {
            a += 5;
        } else if ((a < b) && (b < 3)) {
            a += b;
        } else {
            a += 7;
        }
            
        System.out.println("a ： " + a);
    }
}