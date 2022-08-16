package exam;

class SomeClass{
	public void methodA(){
		System.out.println("SomeClass#methodA()");	
	}
}
class AnotherClass extends SomeClass{
	public void methodA(){
		System.out.println("AnotherClass#methodA");
	}
}
public class ex20_i {

	public static void main(String[] args) {
		AnotherClass ac=new AnotherClass();
		SomeClass sc=new AnotherClass();
		//ac=sc;    sub=super  不可以
		sc=ac;   // super = sub 可以！！
		ac=(AnotherClass)sc; // 除非使用轉型。
		sc.methodA();
		ac.methodA();

	}

}

/*
Given:

public class Test{
	public static void main(String[] args){
		AnotherClass ac=new AnotherClass();
		SomeClass sc=new AnotherClass();
		ac=sc;
		sc.methodA();
		ac.methodA();
	
	}
}

class SomeClass{
	public void methodA(){
		System.out.println("SomeClass#methodA()");	
	}
}

class AnotherClass extends SomeClass{
	public void methodA(){
		System.out.println("AnotherClass#methodA");
	}
}

What is the Result?

A) A ClassCastException is thrown at runtime.

B) SomeClass#methodA()
   AnotherClass#methodA()
   
C) AnotherClass#methodA()
   AnotherClass#methodA()
   
D) The compilation fails

E) AnotherClass#methodA()
   SomeClass#methodA()
   
F) SomeClass#methodA()
   SomeClass#methodA()
   
   

ans:D
*/