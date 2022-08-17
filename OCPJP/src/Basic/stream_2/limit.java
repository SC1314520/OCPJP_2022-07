package Basic.stream_2;

import java.util.stream.Stream;

public class limit {
	public static void main(String[] args) {
		String[] arr= {"喜羊羊","美羊羊","懶羊羊","黑羊羊","白羊羊"};
		Stream.of(arr).limit(3).forEach(System.out::println);
	}
}
