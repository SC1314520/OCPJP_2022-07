package Basic.stream.stream_2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream2 {
	public static void main(String[] args) {
		Stream<Integer> s =Arrays.asList(1,5,3,6).stream();
		Stream<Integer> s2 =Stream.of(1,3,2,8);
		Stream<Integer> s3 = Arrays.stream(new Integer[] {3,5,6,7});
		IntStream s4 =Arrays.stream(new int[] {4,5,6,9});
		
		s.forEach(System.out::println);
		s2.forEach(System.out::println);
		s3.forEach(System.out::println);
		s4.forEach(System.out::println);
		
		
	}
}
