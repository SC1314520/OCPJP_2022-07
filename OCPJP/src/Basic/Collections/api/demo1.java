package Basic.Collections.api;

import java.util.ArrayList;

import java.util.Collections;

public class demo1 {
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		
		Collections.addAll(list, "a","b","c","d","e"); // [a, b, c, d, e]
		/*
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		*/
		System.out.println(list);
		
		Collections.shuffle(list); //打亂順序，每次都不同。
		System.out.println(list); // [a, c, d, e, b]
		
		ArrayList<Integer> list2 =new ArrayList<>();
		list2.add(1);
		list2.add(8);
		list2.add(6);
		list2.add(4);
		list2.add(7);
		list2.add(5);
		list2.add(3);
		list2.add(3);
		
		Collections.sort(list2); // 由小排到大  --> 不可以對 Set 使用
		System.out.println(list2); // [1, 3, 3, 4, 5, 6, 7, 8]
		
		ArrayList<String> list3 =new ArrayList<>();
		list3.add("a");
		list3.add("c");
		list3.add("e");
		list3.add("b");
		list3.add("d");
		Collections.sort(list3);
		System.out.println(list3); // [a, b, c, d, e]
	}
}
