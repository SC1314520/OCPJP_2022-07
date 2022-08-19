package Basic.lambda_2.function;

import java.util.function.Consumer;

public class ex {
	public static void main(String[] args) {
		Consumer<String> t =new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		};
		
		t.accept("java");
		
		
		Consumer<String> t2=str->System.out.println(str);
		t2.accept("java2");
	}
}
