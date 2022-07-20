package Basic.Object_oriented.practice2.method;

public class method {
	//1. field 屬性 (全域變數) -----(1)
	 String name;
	 int chinese,english;
	//int chinese; 屬性區域不可以重複宣告變數。 -----(1)
	
	//-------------------------------------------------------------------//
	
	//2. constructors 建構子 --> 若偵測到有建構子，則 [new階段最後一步] 一定會執行。 -----(2)
	public method() { //無參建構子
		//int chinese = 60; --> 輸出 國文:0 ，因為此為 local 區域變數 -----(1)
		//chinese =60;  --> 輸出 國文:60 ，因為此為 global 全域變數 -----(1)
		System.out.println("我是無參建構子!"); // method std =new method() 時會執行此行程式碼。(無參)-----(2)
		
		
	}
	public method(String name, int chinese, int english) { //建構子
		super();
		this.name = name;
		this.chinese = chinese;
		this.english = english;
		System.out.println("我是帶參建構子!");
		//method std1=new method(name,chinese,english); 時會執行此行程式碼。(帶參) -----(2)
	}
	
	//-------------------------------------------------------------------//
	
	//3. method 方法
	public void add(String name ,int chinese ,int english) { //有 void 則無須撰寫 return。-----(3)
		System.out.println("姓名:"+name+" 國文:"+chinese+" 英文:"+english);
	}
	
	@Override
	public String toString() { //無 void 則需撰寫 return -----(3)
		return "method [name=" + name + ", chinese=" + chinese + ", english=" + english + "]";
	}
	
	

}
