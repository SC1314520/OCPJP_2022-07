package Basic.lambda.function.predicate;

import java.util.function.Predicate;

/*
 *  negate : ! 取反
 */
public class ex4 {
	public static boolean checkString(String s,Predicate<String> pre) {
		
		//return !pre.test(s);
		return pre.negate().test(s);
	}
	public static void main(String[] args) {
		
		String s="abcde";
		boolean b= checkString(s, (String str)->{
			return str.length()>5;
		});
		System.out.println(b);
	}
}
