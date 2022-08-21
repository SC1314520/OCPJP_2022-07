package Basic.stream3.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex1 {
	public static void main(String[] args) {
		// filter
		List<Person> list =new ArrayList<>();
		list.add(new Person("John",12));
		list.add(new Person("Mary",16));
		list.add(new Person("Kelly",18));
		List<Person> list2=list.stream().filter(o->o.getAge()>12).collect(Collectors.toList()); // 返回一個新集合。
	
		// distinct() 去除重複
		Stream<Integer> stream =Stream.of(1,2,3,3,4,4,5);
		stream.distinct().forEach(i->System.out.print(i+" ")); // 1 2 3 4 5 
		System.out.println();
		
		// limit() 限制
		Stream<Integer> stream2 =Stream.of(1,2,3,3,4,4,5);
		stream2.limit(3).forEach(i->System.out.print(i+" ")); // 1 2 3 
		System.out.println();
	
		// skip() 跳過
		Stream<Integer> stream3 =Stream.of(1,2,3,3,4,4,5);
		stream3.skip(3).forEach(i->System.out.print(i+" ")); // 3 4 4 5 
		System.out.println();
		
		// map() 映射 --> 轉換型態
		List<Person> list3 =new ArrayList<>();
		list3.add(new Person("John",12));
		list3.add(new Person("Mary",16));
		list3.add(new Person("Kelly",18));
		list3.stream().map(i->i.getName())
		.collect(Collectors.toList())
		.forEach(i->System.out.print(i+" ")); // John Mary Kelly 
		
		// flapMap() 映射＋展平
		List<String> list4 =Arrays.asList("I am a boy","I love girl");
		list4.stream()
		.map(word->word.split(" "))
		.flatMap(Arrays::stream)
		.collect(Collectors.toList())
		.forEach(i->System.out.print(i+" ")); // I am a boy I love girl 
		System.out.println();
		
		
		List<Integer> list5=Arrays.asList(1,2,3);
		List<Integer> list6=Arrays.asList(3,4);
		List<int[]> pairs =list5.stream().flatMap(i->list6.stream().map(j->new int[] {i,j})).collect(Collectors.toList());
		pairs.forEach(i->System.out.println(Arrays.toString(i)));
		
		
	}				
}	
