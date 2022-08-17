package Basic.lambda.function.supplier;

import java.util.function.Supplier;

/*
 *   Supplier<T> 接口中僅包含一個無參方法： T get()  --> 生產型接口。
 */
public class ex {
	public static String getString(Supplier<String> sup) {
		
		return sup.get();
	}
	public static void main(String[] args) {
	String s=getString(()->{
			return "supplier";
		});
	
	System.out.println(s);// supplier
	
	
	// 優化寫法
	String s2=getString(()->"supplier 2");
	System.out.println(s2);
	}
}
