public class Ex_04_5 {
    public static void main(String[] args) {
        int a = 14;
        
        switch (a % 4) {
        case 0:
            System.out.println("A");
            break;
        case 1:
            System.out.println("B");
            break;
        case 2:
            System.out.println("C");
        case 3:
            System.out.println("D");
            break;
        }
    }
}