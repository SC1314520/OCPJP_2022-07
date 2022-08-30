package Basic;

import java.util.ArrayList;
import java.util.Collection;

public class generic {
	public static void main(String[] args) {
		Collection<Object> o =new ArrayList<>();
		Collection<Number> n =new ArrayList<>();
		Collection<Integer> i =new ArrayList<>();
		
		// getArr(o);
		getArr(n);
		getArr(i);
		
		
		getArr2(o);
		getArr2(n);
		// getArr2(i);
		
	}
	
	// <? extends Number>  只能接收 Number 及其子類別。
	public static void getArr(Collection<? extends Number> coll2) {
		
		
	}
	
	// <? extends Number>  只能接收 Number 及其父類別。
	public static void getArr2(Collection<? super Number> coll2) {
		
		
	}
	

	public static void getExceptions(Collection<? super Exception> coll){
		// 這則要顛倒過來。--> 因為只有 Exception 或其父類別型態的集合可以加入以下的多型。
		coll.add(new RuntimeException());
		coll.add(new Exception());
	}
}