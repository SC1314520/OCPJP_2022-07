package Basic.Object_oriented.practice6_static.method;

public class rate_method_static_pro { // static寫法  --> 優化寫法
	 public static int money; //大家所共用的屬性 -->使用 static (類別類) --> 由 class 所產生。--> 類別類在complier即出現
	 private double rate; // 物件類 --> 大家各有的屬性，由 new 所產生。 --> 物件類需 new 時，才會出現。
	 private int time; // 物件類 --> 大家各有的屬性，由 new 所產生。--> 物件類需 new 時，才會出現。
	 private double sum; // 物件類 --> 大家各有的屬性，由 new 所產生。--> 物件類需 new 時，才會出現。
	public rate_method_static_pro() {
		
	}
	public rate_method_static_pro(double rate, int time) { // static 屬性不須放入建構子
		super();
		this.rate = rate;
		this.time = time;
	}
	public void calc() {
		sum= money*(1+rate*time);
		System.out.println("本金: "+money+" 利率: "+rate+" 期數: "+time+" 本利和: "+sum);
	}
	public static String showString() { //相同用途，利用static --> 可減少記憶體用量。
		return "I am static_pro";
	}
	public static int sum(int x, int y) { // 與 field 變數無關的話，就加 static 。
		return x+y;
	}
}
