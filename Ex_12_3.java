public class Ex_12_3 {
    public static void main(String[] args) {
        Point p = new Point(10,7);
        double d = p.distance();
        
        System.out.println("==== 点p ====");
        System.out.println("x座標：" + p.getX());
        System.out.println("y座標：" + p.getY());
        System.out.printf("原点からの距離：%.3f\n" , d);
        
        Rectangle rec = new Rectangle(3, 5, 9, 9);
        d = rec.distance();
        
        System.out.println("==== 長方形rec ====");
        System.out.println("右下の座標：(" + rec.getX() + ", " + rec.getY() + ")");
        System.out.println("右上の座標：(" + rec.getX2() + ", " + rec.getY2() + ")");
        System.out.println("面積：" + rec.area());
        System.out.printf("原点からの距離：%.3f\n" , d);
        
        
        
        Circle circ = new Circle(2, 2, 1);
        int r = circ.getR();
        
        System.out.println("==== 円circ ====");
        System.out.println("中心のx座標：" + circ.getX());
        System.out.println("中心のy座標：" + circ.getY());
        System.out.println("半径：" + circ.getR());
        System.out.println("面積：" + circ.circleArea());
    }
}