package Basic.stream3.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ex7 {
	public static void main(String[] args) {
		List<Person> list =new ArrayList<>();
		list.add(new Person("John",12));
		list.add(new Person("Mary",16));
		list.add(new Person("Kelly",18));
		list.add(new Person("John",13));
		list.add(new Person("Mary",17));
		list.add(new Person("Kelly",19));
		list.add(new Person("John",14));
		list.add(new Person("Mary",18));
		list.add(new Person("Kelly",20));
		
		// 依照姓名分組，<分組條件類型,對應條件類型>
		Map<String,List<Person>> map=list.stream().collect(Collectors.groupingBy(Person::getName));
		System.out.println(map);
		
	}
}
