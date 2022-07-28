package Basic.Object_oriented.practice3_encapsulation;

public class order_method {
	// field 屬性 --> 只可宣告變數(不可以寫 if...之類的)
	/*
	 * default : 同一個資料夾
	 * public : 不設限制
	 * private : 同一個 class
	 * protected : 繼承的父子類別皆可以使用，其餘不可。
	 */
	private String name;
	private int pencil,ruler;
	/*
	 * 預設建構子: 當方法未自行撰寫建構子時，系統會自動產生無參建構子，該建構子稱之。
	 * 故就算方法未寫 order_method()，主程式呼叫 order_method od = new order_method()時，也不會產生錯誤。
	 */
	//無參建構子
	public order_method() {
	}
	//帶參建構子
	public order_method(String name, int pencil, int ruler) {
			super();
			this.name = name;  //this 代表物件本身，this.name 代表物件本身的name，而 name 指的則是區域變數(方法呼叫時，賦予的數值)。
			this.pencil = pencil;
			this.ruler = ruler;
	}
	
	//方法
	public String add(int pencil ,int ruler) {
		int sum=pencil*10+ruler*20;
		String x="姓名:"+name+" 鉛筆: "+pencil+" 支 尺: "+ruler+" 把 總計: "+sum+" 元";
		return x;
	}
	//overload 多載化: 方法名稱相同，但參數的[欄位數目]或[型態不同]或[順序相異]。
	public String add(String name,int pencil ,int ruler) {
		int sum=pencil*10+ruler*20;
		String x="姓名:"+name+" 鉛筆: "+pencil+" 支 尺: "+ruler+" 把 總計: "+sum+" 元";
		return x;
	}
	public void show() {
		int sum=pencil*10+ruler*20;
		String x="姓名:"+name+" 鉛筆: "+pencil+" 支 尺: "+ruler+" 把 總計: "+sum+" 元";
		System.out.println(x);
	}
	public void show(String name, int pencil, int ruler) {
		int sum=pencil*10+ruler*20;
		String x="姓名:"+name+" 鉛筆: "+pencil+" 支 尺: "+ruler+" 把 總計: "+sum+" 元";
		System.out.println(x);
	}
	
}
