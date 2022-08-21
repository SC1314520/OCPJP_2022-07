package Basic.stream3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ex1 {
	public static void main(String[] args) {
		// 第一種
		List<String> list =Arrays.asList("hello","world");
		Stream<String> stream =list.stream();
		// 第二種
		Stream<String> stream2 =Arrays.stream(new String[] {"hello","world"});
		// 第三種
		Stream<String> stream3 =Stream.of("hello","world");
		
		// 無限流
		Stream.iterate(0, n->n+2).limit(10).forEach(i->System.out.print(i+" ")); // 0 2 4 6 8 10 12 14 16 18 
	
	}
}
