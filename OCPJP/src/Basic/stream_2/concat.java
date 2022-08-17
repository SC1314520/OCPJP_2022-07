package Basic.stream_2;

import java.util.stream.Stream;

public class concat {
	public static void main(String[] args) {
		String[] arr= {"喜羊羊","美羊羊","懶羊羊","黑羊羊","白羊羊"};
		
		Stream<String> stream=Stream.of("1","2","3","4","5");
		Stream<String> stream2=Stream.of(arr);
		
		// 合併流
		Stream.concat(stream,stream2).forEach(System.out::println);
	}
}
