package exam;

public class ex7_i {
	public static void main(String[] args) {
		// switch 只能包含 char,byte,short,int,String,var  (不可以放 Object!!)
		var x=10;   // var 只能在 main 中
		switch (x) {
		case 1:
			
			break;

		default:
			break;
		}
		
	}
}

/*
Variables declared as which of the following are never permitted in a switch statement?
(Choose two)

A. var
B. double
C. int
D. String 
E. char
F. Object



ans:B,F


*/
