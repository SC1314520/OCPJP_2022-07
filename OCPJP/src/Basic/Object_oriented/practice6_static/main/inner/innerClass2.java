package Basic.Object_oriented.practice6_static.main.inner;

public class innerClass2 { //類別類 innerClass
	public static void main(String[] args) {
		//student2.A a1 = new student2().new A(); 不可以這樣寫。 ....(1)
		student2.A a1=new student2.A();
		a1.show(); //A1
		new student2.A().show(); //A1
		//static method
		a1.show2(); //A2
		new student2.A().show2();//A2
		student2.A.show2(); //A2 -->最佳寫法。
		
	
	}
}
class student2{ //外部類別
	// static ： 使用class A 時， student2 不需要 new ....(1)
	static class A{ //內部方法有 static ，則 class 須加 static。
		void show() {
			System.out.println("A1");
		}
		// static ： 使用 show2() 時，class A 不需要 new
		static void show2() {
			System.out.println("A2");
		}
	}
}
// inner class : 物件類的 inner class 不可包含 static 方法
// inner class : 類別類的 inner class 可包含兩者。


