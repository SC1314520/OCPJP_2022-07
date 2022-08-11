package Basic.Collections.api.demo2;

import java.util.ArrayList;

import java.util.Collections;

public class ex {
	public static void main(String[] args) {
		ArrayList<Person> list =new ArrayList<>();
		list.add(new Person("aaa",19));
		list.add(new Person("bbb",18));
		list.add(new Person("ccc",20));
		
		// 若要使用 sort() ，自定義必須實現 Comparable , 覆寫 compareTo
		Collections.sort(list);
		System.out.println(list); // [Person [name=aaa, age=18], Person [name=bbb, age=19], Person [name=ccc, age=20]]
	}
}
