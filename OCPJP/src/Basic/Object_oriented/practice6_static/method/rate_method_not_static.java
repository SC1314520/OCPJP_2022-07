package Basic.Object_oriented.practice6_static.method;

public class rate_method_not_static { // 非static寫法
	private int money;
	private double rate;
	private int time;
	private double sum;
	public rate_method_not_static() {
		
	}
	public rate_method_not_static(int money, double rate, int time) {
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
