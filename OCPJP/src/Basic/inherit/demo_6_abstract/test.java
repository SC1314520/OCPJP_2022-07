package Basic.inherit.demo_6_abstract;

public class test {
	public static void main(String[] args) {
		Company[] c =new Company[] 
		{
			new CA("John", 10),
			//new CB("Mary", 15)
		};
		System.out.println(c[0].show()); // name: John Lcd: 10
		//System.out.println(c[1].show()); // name: Mary RAM: 15
		
		
		c[0].setName("teacher");
		System.out.println(c[0].show()); // name: teacher Lcd: 10
		
		 // 父類別無同方法時
		 //c[0].setLcd(12); //--> 須符合異質宣告條件，父類別需有同方法才能呼叫。
		 ((CA)c[0]).setLcd(12); // 利用轉型
		 System.out.println(c[0].show()); // name: teacher Lcd: 12
		 
		 // 父類別利用抽象方法
		 c[0].setLcd(12);
		 
		 // 抽象方法可以宣告，但不可以 new (產生實體)。  但可以 new 其非抽象的子類別。
		 // Company x =new Company("Kelly"); --> 不可這樣寫
		 Company y =new CA("Sandy", 20);
		 //Company z =new CB("Windy", 30);
		 
		 
	}
}
