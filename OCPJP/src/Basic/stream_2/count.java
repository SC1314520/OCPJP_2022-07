package Basic.stream_2;

import java.util.ArrayList;
import java.util.stream.Stream;

// count 的回傳值為 long  --> 使用後不可再使用 Stream 的其他方法。
public class count {
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		Stream<Integer> stream =list.stream();
		System.out.println(stream.count()); // 7
	}
}
