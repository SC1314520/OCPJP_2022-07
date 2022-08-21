package Basic.stream3.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ex6 {
	public static void main(String[] args) {
		List<Person> list =new ArrayList<>();
		list.add(new Person("John",12));
		list.add(new Person("Mary",16));
		list.add(new Person("Kelly",18));
		
		Map<String, Integer> map =list.stream().collect(Collectors.toMap(Person::getName, Person::getAge));
		Set<String> set =map.keySet();
		Iterator<String> it =set.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println("key: "+s);
			System.out.println("value: "+map.get(s));
		}
	}
}
