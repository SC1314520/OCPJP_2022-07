package Basic.Object_oriented.practice6_static.main.plus;

public class demo_2 {
	// int count; 
	static int count; // ...(1)
	int count2;
	public static void displayMsg() {
		count++; // static 方法裡面必須放 static 參數。...(1)
		System.out.println("welcome"+"visit count"+count);
	}
	public void displayMsg2() {
		count2++;
		System.out.println("welcome"+"visit count"+count2);
	}
	public void displayMsg3() {
		count++; // 非 static 方法，可以放入 static 參數
		System.out.println("welcome"+"visit count"+count);
	}
	public static void main(String[] args) {
		//static -->無需 new
		demo_2.displayMsg(); // 寫法一
		displayMsg(); // 寫法二
		
		//none-static
		new demo_2().displayMsg2();
		
		//static with none static method
		new demo_2().displayMsg3();
		
	}
}
