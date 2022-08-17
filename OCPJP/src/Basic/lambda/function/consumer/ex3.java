package Basic.lambda.function.consumer;

import java.util.function.Consumer;

public class ex3 {
	public static void printInfo(String[] arr,Consumer<String> con1,Consumer<String> con2) {
			for(String message:arr) {
				con1.andThen(con2).accept(message);
			}
	}
	public static void main(String[] args) {
		String[] arr= {"aaa,男","bbb,女","ccc,男"};
		printInfo(arr, (message)->{
			String name=message.split(",")[0];
			System.out.print("name: "+name);
			
		}, (message)->{
			String age=message.split(",")[1];
			System.out.println("。 age: "+age+"。");
			
		});
	}
}
/*
name: aaa。 age: 男。
name: bbb。 age: 女。
name: ccc。 age: 男。
*/