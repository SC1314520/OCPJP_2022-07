package Basic.stream.map;

import java.util.function.Function;
import java.util.stream.Stream;

public class demo1 {
	public static void main(String[] args) {
		Function<Integer, Integer> mapper = n -> 2*n;
		Stream<Integer> mapResult = Stream.of(1,2,3,4).map(mapper);
		
		mapResult.forEach(n->System.out.println(n+" ")); // 2,4,6,8
	}
}
