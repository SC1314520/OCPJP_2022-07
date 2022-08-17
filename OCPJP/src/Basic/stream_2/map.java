package Basic.stream_2;

import java.util.stream.Stream;
// map 轉型
public class map {
	public static void main(String[] args) {
		Stream<String> stream=Stream.of("1","2","3","4","5");
		stream.map(s->Integer.parseInt(s)).forEach(System.out::print);
	}
}
