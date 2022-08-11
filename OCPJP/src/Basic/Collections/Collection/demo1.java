package Basic.Collections.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class demo1 {
	public static void main(String[] args) {
		// 多型
		Collection<String> coll =new ArrayList<>();
		System.out.println(coll); // []
		
		// 新增資料
		coll.add("John");  // add的返回值為 boolean --> 存取成功則為 true。
		coll.add("Mary");
		coll.add("Kelly");
		coll.add("Sherry");
		System.out.println(coll); // [John, Mary, Kelly, Sherry]
		
		// 刪除資料
		coll.remove("John"); // remove的返回值為 boolean
		System.out.println(coll); // [Mary, Kelly, Sherry]
		
		// 判定是否包含
		boolean b4 =coll.contains("John");
		System.out.println(b4); // false
		boolean b5 =coll.contains("Kelly");
		System.out.println(b5); // true
		
		//集合是否為空
		System.out.println(coll.isEmpty()); // false
		
		//元素個素
		System.out.println(coll.size()); // 3
		
		// 集合轉陣列
		Object[] arr =coll.toArray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		// 清空集合
		coll.clear();
		System.out.println(coll); // []
		System.out.println(coll.isEmpty()); // true
	}
}
