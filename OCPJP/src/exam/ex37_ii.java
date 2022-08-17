package exam;

import java.util.Collection;

public class ex37_ii {
	public static void main(String[] args) {
		
	}
	// <? extends Exception>  可代表 Exception 及其子類別。
	// <? super Exception> 可代表 Exception 及其父類別。
	// 答案可為 <Exception>
	public static void getException(Collection<? super Exception> coll) {
		coll.add(new RuntimeException());
		coll.add(new Exception());
	}
}
/*
Which of the following fills in the blank so this code compiles?
public static void getExceptions(Collection<__> coll){
	coll.add(new RuntimeException());
	coll.add(new Exception());
}


A. ?
B. ? extends Exception
C. ? super Exception
D. None of the above


ans:C


*/