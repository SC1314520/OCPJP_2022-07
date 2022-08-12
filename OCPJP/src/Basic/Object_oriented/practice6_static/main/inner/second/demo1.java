package Basic.Object_oriented.practice6_static.main.inner.second;


interface school1_2{
	
}

// 外部類別僅可以擁有一個 public class
class school1{
	private int var=10;
	private static int var2=20;
	private static int sum;
	// 內部類別的 class 可以有多個 public class
	public void show1() {
		System.out.println("hello1");
	}
	
	public void show2() {
		System.out.println("hello2");
		sum=var+var2;  // 物件方法中可包含物件變數與類別變數。
	}
	
	public static void show3() {
		int test=100;
		System.out.println("hello3");
		
		//sum=var+var2;  --> static 方法中僅可包含 static field  --> var 不屬於 static field
		sum=var2;
	}
	
	public class ex{
		public void show4() {
			System.out.println("hello4");
		}
	}
	
	public static class ex2{
		public void show5() {
			System.out.println("hello5");
		}
	}
	
	public static class ex3{ // 內部類別內有 static 方法  --> inner class 須宣告 static 。
		public static void show6() {
			System.out.println("hello6");
		}
	}
	public class ex4{
		public class third{
			public void show7() {
				System.out.println("hello7");
			}
			
			
		}
	}
	
	public static class ex5{
		public static class third2{
			public void show8() {
				System.out.println("hello8");
			}
			private void demoF(){
				System.out.println("demoF");
			}
			private static void demoS(){
				System.out.println("demoS");
			}
		}
	}
	
	public static class ex6{
		private static int x=10;
		private int y=20; // 可以放 local none-static field。
		public class third3{
			public class fourth { // 不可以宣告成 static
				public void show9() {
					//sum=var+var2;  --> var 不屬於 static field 也不屬於 local none-static field
					sum=var2;
					System.out.println("hello9");
				}
			}
		}
	}
	
	public class ex7{
		//private static int k=20;  --> 不可撰寫 static field。
		private int z=10;
		public class third4{ // 不可以宣告成 static
			public void show10(){
				
				// 同外部類別中的普通方法呼叫。
				new school1().show1(); //產生物件後呼叫。
				show1(); // 直接呼叫。
				
				// 同外部類別中的 static 方法呼叫。
				school1.show3(); // 直接呼叫類別方法。
				show3(); // 直接呼叫。
				
				// 呼叫同一個 class 中的其他 inner class 中的 private method。
				new school1.ex5.third2().demoF();
				school1.ex5.third2.demoS();
				
				// 也可以呼叫其他 inner class 中的 private field。
				school1.ex6.x=20;
				
				System.out.println("show10");
			}
		}
	}
	private void demoT() {
		System.out.println("demoT");
	}

}
/*
 * 總結：
 * 	1. 內部類別最外層若不為 static，則內部的內部類別不可為 static。
 *  2. 若內部類別內的「變數」與「方法」要宣告成 static，則內部類別必須宣告成 static。
 *  一語以蔽之： 內部若要有 static field, class or method，則內部類別最外層須宣告成 static。
 *  
 * 內部類別與外部類別的差異：
 * 	1. 外部：同一檔案中，只可以有一個 public class 。內部： 可以同時包含多個 public inner class。
 * 	
 *  2. 外部：最外層「不可」宣告成 static，且裡面可以存放 static field,method,class。 
 * 	   內部：若內部須放置static field,method,class，則內部類別最外層須宣告成 static inner class。 --> 此外，static inner class 可以放 inner none-static field。
 *  
 *  3. 外部：static method 只能使用 static field / method's local none-static field。內部：static inner method, static inner class 只可使用 static field 或 inner none-static field。
 *    「但 static class & static inner class 皆可以使用 none-static method，但其中的 none-static method 中依舊只能使用 static field / method's local none-static field。」
 *  
 *  4. 外部：不可互相呼叫對方的 private field/method。 內部：可以互相呼叫對方的 private field/method。
 */

public class demo1 {
	public static void main(String[] args) {
		
		new school1().show1();
		new school1().show2();
		school1.show3(); // static 方法無需 new 物件即可呼叫。
		new school1().new ex().show4();
		new school1.ex2().show5();
		school1.ex3.show6();
		
		// 多層類別
		new school1().new ex4().new third().show7(); // 全物件類
		new school1.ex5.third2().show8(); // 全類別類
		new school1.ex6().new third3().new fourth().show9();
		new school1().new ex7().new third4().show10();
		
		//new school1().demoT(); --> 不可呼叫其他外部類別的 private method。
	}
	
}





