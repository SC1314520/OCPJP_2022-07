package Basic.stream_2;

import java.util.stream.Stream;

public class filter {
	public static void main(String[] args) {
		Stream<String> stream=Stream.of("張三豐","張璀三","趙敏","趙雲");
		stream.filter(name->name.startsWith("張")).forEach(System.out::println);
		
		// 同一個 stream 只能使用一次！！ --> java.lang.IllegalStateException: stream has already been operated upon or closed.
		//stream.filter(name->name.startsWith("張")).forEach(System.out::println);
	}
}
