package Basic.Collections.List.ArrayList;

import java.util.ArrayList;

public class demo3 { // 迴圈印出資料
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		list.add("Mary");
		list.add("Kelly");
		list.add("Sherry");
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(String i:list) {
			System.out.println(i);
		}
	}
}
