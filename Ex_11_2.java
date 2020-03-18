public class Ex_11_2 {
    public static void main(String[] args) {
        System.out.println("点の数：" + Point.getCounter() + "\n");
        
        Point p = new Point(10,7);
        double d = p.distance();
        
        System.out.println("==== 点p ====");
        System.out.println("x座標：(" + p.getX() + ", " + p.getY() + ")");
        System.out.printf("原点からの距離:%.3f\n" , d);
        System.out.println("点の数：" + Point.getCounter() + "\n");
        
        Point q = new Point(5,12);
        d = q.distance();
        
        System.out.println("==== 点q ====");
        System.out.println("x座標：" + q.getX());
        System.out.println("y座標：" + q.getY());
        System.out.printf("原点からの距離：%.3f\n" , d);
        System.out.println("点の数：" + Point.getCounter() + "\n");

        d = Point.distanceOf(6,11);
        System.out.printf("点(6,11)の原点からの距離：%.3f\n", d);
    }
}