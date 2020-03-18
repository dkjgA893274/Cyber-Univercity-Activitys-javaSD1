public class IfTest2 {
    public static void main(String[] args) {
        int a = 5, b = 3;
        
        if(a >= b){
           b = b + 4;
        }
        if((a < b) && (b < 10)) {
           a += b;
        } else if ((a < b)||(b < 10)) {
            a -= b;
        } else {
            a = 0;
        }
        System.out.println("a : " + a);
    }
}