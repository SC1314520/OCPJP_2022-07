package Basic.Collections.List.ArrayList.demo6;

import java.util.ArrayList;



public class ex { // 自訂物件集合
	public static void main(String[] args) {
		ArrayList<Student> list =new ArrayList<>();
		list.add(new Student("John",20));
		list.add(new Student("Mary",21));
		list.add(new Student("Kelly",22));
		list.add(new Student("Sherry",23));
		
		for(int i=0;i<list.size();i++) {
			System.out.println("name: "+list.get(i).getName());
			System.out.println("age: "+list.get(i).getAge());
		}
	}
}
