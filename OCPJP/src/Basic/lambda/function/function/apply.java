package Basic.lambda.function.function;

import java.util.function.Function;

// Function<T,R> 接口用來根據一個類型數據得到另一個類型的數據。
public class apply {
	public static void change(String s,Function<String,Integer> fun) {
		Integer in = fun.apply(s);
		System.out.println(in);
	}
	public static void main(String[] args) {
		String s="1234";
		change(s, (str)->{
			return Integer.parseInt(s);
		});
		
		// 優化寫法
		change(s, str->Integer.parseInt(s));
	}
}
