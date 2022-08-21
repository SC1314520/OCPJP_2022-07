package Basic.stream3.api;

import java.util.ArrayList;
import java.util.List;

public class ex2 {
	public static void main(String[] args) {
		// anyMatch()
		List<Person> list =new ArrayList<>();
		list.add(new Person("John",12));
		list.add(new Person("Mary",16));
		list.add(new Person("Kelly",18));
		
		boolean b = list.stream().anyMatch(p->p.getName().equals("John"));
		System.out.println(b); // true
		
		// allMatch()
		boolean b2 =list.stream().allMatch(p->p.getAge()>=12);
		System.out.println(b2); // true
		
		// noneMatch()
		boolean b3 =list.stream().noneMatch(p->p.getName().equals("John"));
		System.out.println(b3); // false
		
		// findAny() 隨機印出元素，但很有可能是第一個。
		System.out.println(list.stream().findAny());
		
		// findFirst() 找出第一個元素。
		System.out.println(list.stream().findFirst());
		
		
	
		
	}
}
