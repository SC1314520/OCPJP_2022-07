package Basic.Collections.Collection.Iterator;

import java.util.ArrayList;

public class ex2 { // for-each --> 迭代器的簡化
	public static void main(String[] args) {
		demo();
		demo2();
	}
	
	public static void demo(){ //陣列
		int[] arr= {1,2,3,4,5};
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	public static void demo2(){ //集合
		ArrayList<String> list =new ArrayList<>();
		list.add("John");  
		list.add("Mary");
		list.add("Kelly");
		list.add("Sherry");
		
		for(String s:list) {
			System.out.println(s);
		}
	}
}
