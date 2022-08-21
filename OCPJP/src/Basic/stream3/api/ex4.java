package Basic.stream3.api;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ex4 {
	public static void main(String[] args) {
		List<Person> list =new ArrayList<>();
		list.add(new Person("John",12));
		list.add(new Person("Mary",16));
		list.add(new Person("Kelly",18));
		
		OptionalInt x=list.stream().mapToInt(p->p.getAge()).max();
		//OptionalDouble
		//OptionalLong
		System.out.println(x.getAsInt()); // 18 
	}
}
