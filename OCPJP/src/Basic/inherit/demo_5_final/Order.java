package Basic.inherit.demo_5_final;

public /* final */ class Order {  // public final class 不可被繼承!!
	private String name; // private --> 可利用 set 更改。
	final double pi=3.14; // 常數 -->不可更改，也不可使用set方式修改。 --> 只可讀，不可改。
	final double pi2;  //--> 沒給初始值，編譯不會過! ....(1) --> 空 final 變數需搭配建構子。
	
	public Order() {
		this.pi2 = 0;  // 但也可從建構子賦予初始值....(1)  
	}
	public Order(String name) {
		this.name=name;
		this.pi2 = 0; // 但也可從建構子賦予初始值....(1) 
	}
	
	final String show() { // final method 不可以被 override !!
		return "name= "+name;
	}
}
