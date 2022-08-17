package Basic.lambda.function.predicate;

import java.util.function.Predicate;

/*
 *  and 方法：
 *  
 *  需求： 判斷一個字串，有兩個判斷條件。
 *  
 *  兩個要求必須同時滿足，我們就可以使用 && 連接兩個條件
 *  
 *  Predicate 接口中有一個方法 and，表示並且關係，也可以用於連接兩個條件判斷。
 */

public class ex2 {
	public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2) {
		//return pre1.test(s) && pre2.test(s);
		return pre1.and(pre2).test(s); // 等價
	}
	public static void main(String[] args) {
		String s="bcdefg";
		boolean b=checkString(s, (String str)->{
			return str.length()>5;
		}, (String str)->{
			return str.contains("a");
		});
		System.out.println(b);
	}
}
