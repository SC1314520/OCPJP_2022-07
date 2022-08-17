package Basic.lambda.function.predicate;

import java.util.function.Predicate;
/*
 *  or: ||
 */
public class ex3 {
	public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2) {
		//return pre1.test(s) || pre2.test(s);
		return pre1.or(pre2).test(s); // 等價
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
