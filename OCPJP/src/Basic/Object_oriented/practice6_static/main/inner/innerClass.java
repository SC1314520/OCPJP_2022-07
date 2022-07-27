package Basic.Object_oriented.practice6_static.main.inner;

public class innerClass { //物件類 innerClass
	public static void main(String[] args) {
		//1.
		//new student(); 外部類別可以這樣寫
		//new student$A(); 內部類別不可以這樣寫
		
		//2.
		student s1=new student();
		s1.show(); // hello student!
		student.A a1=new student().new A();
		a1.show(); // hello A
		
		//3.
		new student().show(); // hello student!
		new student().new A().show(); // hello A
	}
}

class student{ // outer class 外部類別
	void show() {
		System.out.println("hello student!");
	}
	class A{ // inner class 內部類別
		void show() {
			System.out.println("hello A");
		}
	}
	class B{ // inner class 內部類別
		
	}
}
