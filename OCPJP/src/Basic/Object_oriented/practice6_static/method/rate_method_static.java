package Basic.Object_oriented.practice6_static.method;

public class rate_method_static { // static寫法
	 public static int money; //大家所共用的屬性 -->使用 static (類別類) --> 由 class 所產生。--> 類別類在complier即出現
	 double rate; // 物件類 --> 大家各有的屬性，由 new 所產生。 --> 物件類需 new 時，才會出現。
	 int time; // 物件類 --> 大家各有的屬性，由 new 所產生。--> 物件類需 new 時，才會出現。
	 double sum; // 物件類 --> 大家各有的屬性，由 new 所產生。--> 物件類需 new 時，才會出現。
	public rate_method_static() {
		
	}
	public rate_method_static(int money, double rate, int time) {
		super();
		this.money = money;
		this.rate = rate;
		this.time = time;
	}
	public void calc() {
		sum= money*(1+rate*time);
		System.out.println("本金: "+money+" 利率: "+rate+" 期數: "+time+" 本利和: "+sum);
	}
}
