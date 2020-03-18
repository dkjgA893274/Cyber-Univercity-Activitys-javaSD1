public class Body {
    String name;
    double height;
    double weight;
    
    public Body() {                                               //コンストラクタ1
        set("", 0.0, 0.0);
    }
    
    public Body(double height, double weight) {                   //コンストラクタ2
        set("", height, weight);
    }
    
    public Body(String name, double height, double weight) {      //コンストラクタ3
        set(name, height, weight);
    }
    
    public void print() {                                         //プリントメソッド
        System.out.println("名前：" + name);
        System.out.println("身長：" + height + " cm");
        System.out.println("体重：" + weight + " kg");
    }
    
    public double calcStdWeight() {                               //標準体重計算メソッド
        double meterHeight = height / 100.0;
        double stdWeight = meterHeight * meterHeight * 22.0;
        return stdWeight;
    }
    
    public double calcBmi() {                                     //BMI計算メソッド
        double meterHeight = height / 100.0;
        double bmiValue = weight / (meterHeight * meterHeight);
        return bmiValue;
    }
    
    public void set(String name, double height, double weight) {  //値を設定する
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}