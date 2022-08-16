package exam;



interface ExampleInterface{
	// field --> 只可放常數，不可放普通變數。
	public int x=10;  // 一定要給初始值！！   --> 預設是 public static final
	
	// interface 無建構子
	
	// methods --> public abstract 可省略。
	public String method();
	
	// java 8 以後新寫法    --> default 物件類 / static 類別類  --> 非抽象方法，可有 body
	public default String show1() {
		return "cute!";
	}
	public static String show2() {
		return "cute2";
	}
	
}



/*
Given:

public interface ExampleInterface{}

Which two statements are valid to be written in this interface?

A) public String method();
B) public void methodF(){
		System.out.println("F");
   }
C) public int x;
D) final void methodE()
E) final void methodG(){
		System.out.println("G");
   }
F) private abstract void methodC();
G) public abstract void methodB();




ans:AG

*/