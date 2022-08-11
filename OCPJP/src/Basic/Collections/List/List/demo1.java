package Basic.Collections.List.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *  List:
 *  	1.有序集合，存儲元素與取出元素的順序一致。
 *  	2.有索引，包含了一些帶索引的方法。
 *  	3.允許存儲重複的元素。
 */
public class demo1 {
	public static void main(String[] args) {
		List<String> list =new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("a");
		System.out.println(list);//[a, b, c, d, a]  -->有序且重複
		
		//在指定位置插入資料
		list.add(3,"insert");
		System.out.println(list);// [a, b, c, insert, d, a]
		
		//刪除指定資料
		String R =list.remove(2);
		System.out.println(R); // c -->被刪除的元素
		System.out.println(list);// [a, b, insert, d, a]
		
		
		//替換資料
		String s =list.set(1,"set");
		System.out.println(s); // b  --> 被替換的元素
		System.out.println(list);// [a, set, insert, d, a]
		
		
		//印出資料
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		Iterator<String> it =list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(String c:list) {
			System.out.println(c);
		}
	}
}
