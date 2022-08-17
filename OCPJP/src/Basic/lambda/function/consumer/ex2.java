package Basic.lambda.function.consumer;

import java.util.function.Consumer;

/*
 *  andThen:
 *  	需要兩個 Consumer 接口，可以把兩個接口組合到一起，再對數據進行消費。
 */
public class ex2 {
		
	public static void method(String s, Consumer<String> con1, Consumer<String> con2) {
//		con1.accept(s);
//		con2.accept(s);
		
		// 誰寫前面，誰先消費。 先執行 con1，再執行 con2 。
		con1.andThen(con2).accept(s);

	}
	
	public static void main(String[] args) {
		method("hello", (t)->{
			System.out.println(t.toUpperCase());
		}, (t)->{
			System.out.println(t.toLowerCase());
		});
	}
}

