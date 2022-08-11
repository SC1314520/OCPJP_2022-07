package Basic.Collections.List.ArrayList;

import java.util.ArrayList;

public class demo2 { // 常用 API
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		System.out.println(list); // []
		
		boolean success =list.add("John"); // add的返回值為 boolean
		System.out.println(list); // [John]
		System.out.println(success); // true  --> 成功添加
		
		list.add("Mary");
		list.add("Kelly");
		list.add("Sherry");
		
		System.out.println(list); //[John, Mary, Kelly, Sherry]
		
		// 索引值從零開始
		System.out.println(list.get(0)); //John
		System.out.println(list.get(3)); //Sherry
		
		//刪除資料
		String who=list.remove(2);  // remove 的回傳值為 String
		System.out.println(who); //Kelly  --> 刪除的內容
		System.out.println(list);//[John, Mary, Sherry]
		
		//集合長度
		int size =list.size();
		System.out.println(size); //3
	}
}
