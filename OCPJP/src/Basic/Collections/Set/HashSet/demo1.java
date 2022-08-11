package Basic.Collections.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set 特點：
 * 1. 不允許存儲重複的元素
 * 2. 沒有索引，沒有帶索引的方法，也不能使用普通的for迴圈印出。
 * 
 * HashSet 特點：
 * 3. 無序的集合，存儲元素與取出元素的順序可能不一致。
 * 4. hash表結構，查詢速度非常快！！
 * 
 */
public class demo1 {
	public static void main(String[] args) {
		Set<Integer> set =new HashSet<>();
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(1);
		
		Iterator<Integer> it =set.iterator();
		while(it.hasNext()){
			Integer n =it.next();
			System.out.println(n); // 1,2,3    -->無序且不重複
		}
		for(Integer i:set) {
			System.out.println(i); // 1,2,3   -->無序且不重複
		}
	}
}
