package Basic.stream.sorted;

import java.util.Comparator;
import java.util.stream.Stream;

public class ex2 {
	public static void main(String[] args) {
		Comparator<Order2> c=(o1,o2)->o1.getSum()-o2.getSum(); // 由小排到大。
		Stream.of(new Order2("a", 90),new Order2("h", 80),new Order2("c", 50),new Order2("d", 70)).sorted(c).forEach(Order2::show);
	}
}
