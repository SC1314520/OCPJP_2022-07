package Basic.lambda.function.function;

import java.util.function.Function;

public class ex {
	public static int change(String s, Function<String, String> fun1,
										Function<String, Integer> fun2,
										Function<Integer, Integer> fun3) {
		return fun1.andThen(fun2).andThen(fun3).apply(s);
	}
	public static void main(String[] args) {
		String str="貂蟬,20";
		int i=change(str,s->s.split(",")[1]
		, s-> Integer.parseInt(s)
		, num->num+100);
		System.out.println(i);
	}
}
