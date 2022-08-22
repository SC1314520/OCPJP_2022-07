package Basic.lambda_2.function;

import java.util.function.Function;

public class ex1 {
	public static void main(String[] args) {
		Function<String, Integer> f=new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				
				return Integer.parseInt(t);
			}
		
		};
		
		Integer x =f.apply("123");
		System.out.println(x); // 123
	}
}
