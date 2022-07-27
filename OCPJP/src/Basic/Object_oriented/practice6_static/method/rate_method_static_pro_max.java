package Basic.Object_oriented.practice6_static.method;

public class rate_method_static_pro_max { // static寫法  --> 優化寫法
	 private static int money; //大家所共用的屬性 -->使用 static (類別類) --> 由 class 所產生。--> 類別類在complier即出現
	 private double rate; // 物件類 --> 大家各有的屬性，由 new 所產生。 --> 物件類需 new 時，才會出現。
	 private int time; // 物件類 --> 大家各有的屬性，由 new 所產生。--> 物件類需 new 時，才會出現。
	 private double sum; // 物件類 --> 大家各有的屬性，由 new 所產生。--> 物件類需 new 時，才會出現。
	public rate_method_static_pro_max() {
		
	}
	public rate_method_static_pro_max(double rate, int time) { // static 屬性不須放入建構子
		super();
		this.rate = rate;
		this.time = time;
	}
	
	public static int getMoney() {
		return money;
	}
	public static void setMoney(int money) {  //若要撰寫 static void --> 裡面的變數也要是 static 型態。
		rate_method_static_pro_max.money = money;  // 這是類別類的撰寫法。
		// 不可撰寫為 this.money=money;   <-- this 在編譯時，會被拿來判斷視為物件類，所以此寫法只有物件類可以使用。
	}
	public static void setMoney2(int money2) { //也可以這樣寫
		money=money2;
	}
	
	public void calc() {
		sum= money*(1+rate*time);
		System.out.println("本金: "+money+" 利率: "+rate+" 期數: "+time+" 本利和: "+sum);
	}

}
