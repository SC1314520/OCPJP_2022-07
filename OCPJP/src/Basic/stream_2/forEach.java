package Basic.stream_2;

import java.util.stream.Stream;

/*
 *  forEach 使用以後，就不可以再使用stream的其他方法。
 */
public class forEach {
	public static void main(String[] args) {
		Stream<String> stream= Stream.of("張三","李四","王五","趙六","田七");
		stream.forEach(System.out::println);
	}
}
