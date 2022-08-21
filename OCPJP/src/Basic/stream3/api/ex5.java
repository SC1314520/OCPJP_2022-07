package Basic.stream3.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class ex5 {
	public static void main(String[] args) {
		List<Person> list =new ArrayList<>();
		list.add(new Person("John",12));
		list.add(new Person("Mary",16));
		list.add(new Person("Kelly",18));
		
		Long count =list.stream().collect(Collectors.counting());
		System.out.println(count); // 3
		
		Optional<Person> max =list.stream().collect(Collectors.maxBy(Comparator.comparingInt(Person::getAge)));
		System.out.println(max); // Optional[Person [name=Kelly, age=18]]
		
		Integer sum= list.stream().collect(Collectors.summingInt(Person::getAge));
		System.out.println(sum);//46
		
		Double avg=list.stream().collect(Collectors.averagingDouble(Person::getAge));
		System.out.println(avg);//15.333333333333334
		
		System.out.println(Stream.of("hello","world").collect(Collectors.joining(" "))); // hello world
	}
}
