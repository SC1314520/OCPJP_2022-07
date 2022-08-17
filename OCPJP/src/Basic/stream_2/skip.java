package Basic.stream_2;

import java.util.stream.Stream;

public class skip {
	public static void main(String[] args) {
		String[] arr= {"喜羊羊","美羊羊","懶羊羊","黑羊羊","白羊羊"};
		
		// 跳過前幾個
		Stream.of(arr).skip(3).forEach(System.out::println);
		
		// 超過長度則返回空流。
		Stream.of(arr).skip(6).forEach(System.out::println);
	}
}
