package exam;

import java.util.List;
import java.util.function.UnaryOperator;

public class ex45_i {
	public static void main(String[] args) {
		  var list=List.of(1,2,3,4,5,6,7,8,9,10);
		  UnaryOperator<Integer> u=i->i*2;  
		  UnaryOperator<Integer> u2=(var i)->i*2;
		  UnaryOperator<Integer> u3=(Integer i)->{return i*2;};  // <- 最後面記得加 ;
		  UnaryOperator<Integer> u4=(Integer i)->i*2;
		  UnaryOperator<Integer> u5=i->{return i*2;};
		  list.replaceAll(u);
	}
}
/*
Given the code fragment:

 1. var list=List.of(1,2,3,4,5,6,7,8,9,10);
 2. UnaryOperator<Integer> u=i->i*2;
 3. list.replaceAll(u);
 
Which can replace line 2?

A) UnaryOperator<Integer> u=var i->{return i*2;}  //  最後面少了一個 ;
B) UnaryOperator<Integer> u=i->{return i*2;}  // 最後面少了一個 ;
C) UnaryOperator<Integer> u=(var i)->(i*2);
D) UnaryOperator<Integer> u=(int i)->i*2; // 宣告必須是 Integer


ans:C
*/
