package Basic.inherit.demo_1;

public class test {
	public static void main(String[] args) {
		//A a = new A();   is-a A, is-a S
		//B b = new B();   is-a A, is-a S
		A a = new A("John",80,80);
		B b = new B("Mary",70,90);
		a.show(); // is-a A
		b.show(); // is-a B
	}
}

/*  
 	給定下面程式碼，哪些選項的描述是對的?(選擇3個)
	01. class Animal{}
	02. class Dog extends Animal{Tail tail;}
	03. class Beagle extends Dog{public void jumper(){}}
	04. class Cat extends Animal{public void jumper(){}}

	A. Cat is-a Animal
	B. Cat is-a jumper
	C. Dog is-a Animal
	D. Dog is-a jumper
	E. Beagle has-a Tail
	
	答案: ACE
 */
/*
 *  is-a 指的是 class (包含本身,繼承,繼承的繼承~~~)
 *  has-a 指的是本身的 field,method 與繼承以上的 field,method
 */