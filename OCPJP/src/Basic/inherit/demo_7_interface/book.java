package Basic.inherit.demo_7_interface;

public interface book { //--> interface 不可以 new
	
	// field --> 只可放常數，不可放普通變數 --> 前贅詞可以省略(public static final)
	public static final double pi=3.14;  // final --> 要賦予初始值
	/* public static final */ double pi2=3.14;
	
	// constructors ( interface 無建構子)
	// book(String name){}  --> 不可撰寫建構式。
	
	// methods --> public abstract 可省略。
	public abstract void bookName(String name);	
	/* public abstract */double bookPrice(double price);
	
	
	// java 8 以後新寫法    --> default 物件類 / static 類別類  --> 非抽象方法，可有 body
	public default void CompanyName(String name) {  // 物件類-->物件呼叫
		System.out.println("cname: "+name);
	}
	public static void CompanyName2(String name) { // 類別類 -->介面類別呼叫(只可用類別呼叫法，無法與普通的 static 一樣能夠使用物件方式呼叫。)
		System.out.println("c2name: "+name);
	}
}
