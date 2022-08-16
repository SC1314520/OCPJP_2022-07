package exam;

interface AbilityA{
	default void action(){
		System.out.println("a action");
	}
}

interface AbilityB{
	void action();

}
public class ex21 implements AbilityA,AbilityB{
	public void action() {
		System.out.println("ab action");
	}
	public static void main(String[] args){ 
		AbilityB x=new ex21(); 			
		x.action();	 // ab action
		AbilityA y=new ex21();
		y.action(); // ab action
		
		/*
		 
		 若只有繼承 AbilityA 且無 override，則：
		 
		 AbilityA y=new ex21();
		 y.action(); // a action
		 */
		 
		
	}
}
/*
Given:

interface AbilityA{
	default void action(){
		System.out.println("a action");
	}
}

and

interface AbilityB{
	void action();

}

and

public class Test implements AbilityA,AbilityB{ // line 1
	public void action() {
		System.out.println("ab action");
	}
	public static void main(String[] args){ 
		AbilityB x=new Test(); 			//line 2
		x.action();	
	}
}

What is the result?

A) The compilation fails on line 1
B) An exception is thrown at run time
C) The compilation fails on line 2
D) a action
E) ab action




ans:E

*/