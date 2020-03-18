public class Ex_10_1 {
    public static void main(String[] args) {
        Point p = new Point(10,7);
        double d = p.distance();
        
        System.out.println("==== 点p ====");
        System.out.println("x座標：" + p.x);
        System.out.println("y座標：" + p.y);
        System.out.printf("原点からの距離:%.3f\n" , d);
        
        p.x = 5;
        p.y = 12;
        d = p.distance();
        
        System.out.println("==== 点p ====");
        System.out.println("x座標：" + p.x);
        System.out.println("y座標：" + p.y);
        System.out.printf("原点からの距離:%.3f\n" , d);
    }
}