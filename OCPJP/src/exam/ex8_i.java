package exam;

public class ex8_i {
	public static void main(String[] args) {
		// 因為 var 只能在 main 中執行！！！！！！！  --> 所以答案為 B
		
		// 但若放在 main 中，答案則為 Plan B
		var plan=1;
		 plan=plan++ + --plan;  // [1+(1-1)]+1=2
		 if(plan==1){
			 System.out.print("Plan A");
		 }else if(plan==2) 
		 {
			 System.out.print("Plan B");
		 }
		 else System.out.print("Plan C");
		 }
	
	}

/*
What is the output of the following application?

package planning;
 public class ThePlan{
	 var plan=1;
	 plan=plan++ + --plan;
	 if(plan==1){
		 System.out.print("Plan A");
	 }else{ if(plan==2) System.out.print("Plan B");
	 }else System.out.print("Plan C");}
	}
}

A. Plan A
B. Plan B
C. Plan C
D. The class does not compile
E. None of the above




ans: D
*/