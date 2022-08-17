package Basic.lambda.function.consumer;

import java.util.function.Consumer;

/*
 *  Consumer: 消費型接口：泛型執行什麼類型，就可以使用 accept() 方法消費什麼類型的數據。
 *  至於具體怎麼消費（使用），需要自定義（輸出,計算...)
 */
public class ex {
	public static void method(String name,Consumer<String> con) {
		con.accept(name);
	}
	public static void main(String[] args) {
		method("John", (name)->{
		// 輸出字串
			System.out.println(name);
		// 反轉輸出
			StringBuilder reName =new StringBuilder(name).reverse();
			System.out.println(reName);
		
		});
	}
}
