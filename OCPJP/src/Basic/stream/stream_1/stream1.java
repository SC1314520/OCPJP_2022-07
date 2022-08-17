package Basic.stream.stream_1;

import java.util.Arrays;
import java.util.List;

public class stream1 {
	public static void main(String[] args) {
		List<Person> list =Arrays.asList(new Person("a", "b", 30),new Person("c", "d", 40),new Person("e", "f", 50),new Person("g", "h", 60));
		// list API 寫法
		list.forEach(p->System.out.println(p));
		
		// stream 寫法
		list.stream().filter(t->t.getAge()>40).forEach(p->System.out.println(p));
	}
}
