package Basic.stream.map;

import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class demo2 {
	public static void main(String[] args) {
		ToIntFunction<String> mapper = n->Integer.parseInt(n);
		IntStream mapResult =Stream.of("a1","a2","a3","a4").map(s->s.substring(1)).mapToInt(mapper);
		
		mapResult.forEach(n->System.out.println(n+" "));
		
	}
}
