package Basic.Collections.List.ArrayList.demo7;

import java.util.ArrayList;


public class ex { // 自訂印出格式
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		list.add("John");
		list.add("Mary");
		list.add("Kelly");
		System.out.println(list); // [John, Mary, Kelly]
		
		demo7_method.printArrayList(list); // {John @ Mary @ Kelly}
	}
}
