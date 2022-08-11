package Basic.Collections.Collection.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ex {
	/*
	 * 使用步驟：
	 * 	1. 使用集合中的方法 iterator() 獲取迭代器的實現類對象，使用Iterator接口接收（多型）。
	 * 	2. 使用 Iterator 接口中的方法 hasNext 判斷還有沒有下一個元素
	 *	3. 使用 Iterator 接口中的方法 next 取出集合中的下一個元素。
	 */	
	public static void main(String[] args) {
		Collection<String> coll =new ArrayList<>();
		coll.add("John");  
		coll.add("Mary");
		coll.add("Kelly");
		coll.add("Sherry");
		
		Iterator<String> it=coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); // John Mary Kelly Sherry
		}
		
		for(Iterator<String> it2=coll.iterator(); it2.hasNext();) {
			System.out.println(it2.next()); // John Mary Kelly Sherry
		}
	}
}
