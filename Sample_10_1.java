public class Sample_10_1 {
    public static void main(String[] args) {
        Body st1 = new Body();
        st1.name = "Frank";
        st1.height = 175.0;
        st1.weight = 63.5;
        
        Body st2 = new Body();
        st2.name = "Thomas";
        st2.height = 177.0;
        st2.weight = 72.0;
        
        System.out.println("学生1");
        System.out.println("　名前：" + st1.name);
        System.out.println("　身長：" + st1.height + " cm");
        System.out.println("　体重：" + st1.weight + " kg");
        
        System.out.println("学生2");
        System.out.println("　名前：" + st2.name);
        System.out.println("　身長：" + st2.height + " cm");
        System.out.println("　体重：" + st2.weight + " kg");
    }
}