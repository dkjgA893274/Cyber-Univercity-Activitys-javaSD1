public class MethodTest2 {
    public static void main(String[] args) {
        double[] p = methodA(5,1.0);
        
        for (int i=0; i<p.length; i++) {
            System.out.println(p[i]);
        }
    }

    public static double[] methodA(int n, double x) { 
        double[] arr = new double[n];
        for (int i=0; i<n; i++) {
             arr[i] = x;
        }
        
        return arr;
    }
}