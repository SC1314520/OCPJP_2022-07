package Basic.lambda.function.function;

import java.util.function.Function;

/*
 *  andThen: 可以將兩個 Function 接口組合操作
 */
public class andThen {
	public static void change(String s,Function<String, Integer> fun1,Function<Integer, String> fun2) {
		String ss=fun1.andThen(fun2).apply(s);
		System.out.println(ss);
	}
	public static void main(String[] args) {
		String s="123";
		change(s, (str)->{
			return Integer.parseInt(str)+10;
		}, (num)->{
			return String.valueOf(num);
		});
		
		//優化寫法
		change(s, str->Integer.parseInt(str)+10, num->String.valueOf(num));
	}
}
