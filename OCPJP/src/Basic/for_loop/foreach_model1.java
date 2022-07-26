package Basic.for_loop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class foreach_model1 {
	public static void main(String[] args) {
		//陣列
		String[] names = {"John","Mary","Kelly"};
		for(String name :names) {     // for each 寫法 for(元素型別 元素 ：物件）
			System.out.println(name); //輸出 John,Mary,Kelly
		}
		
		//---------------------------------------------------------//
		
		//集合
		List<Integer> list =new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		for(int x : list) {
			System.out.println(x); //輸出 1,2,3
		}
		
		//---------------------------------------------------------//
		
		//Map
		Map<String,String> map =new LinkedHashMap<String,String>(); // LinkedHashMap 有序的
		map.put("s1", "123");
		map.put("s2", "456");
		map.put("s3", "789");
		
		//iterator -->其一寫法     // keySet()方法回傳值是Map中key值的集合
		Set<String> set = map.keySet();  // Set 是一種集合，不會存放重複元素，注重獨一無二的性質。  --> 子類別： LinkedHashSet、HashSet、TreeSet
		Iterator<String> it = set.iterator(); // iterator 迭代器 可使用於任何集合 如：HashSet、ArrayList
		while (it.hasNext()) {
			String key = it.next(); //取得 key 值
			System.out.printf("key:%s,value:%s\n", key, map.get(key));  //map.get(key) 取得對應數值
		}
				
		//forEach -->另一寫法 //entrySet()的回傳值是回傳一個Set集合
		for (Map.Entry<String, String> entry : map.entrySet()) {  // Entry 是 Map內部的介面，可寫成 Entry<String,String> -->裡面有 keySet(),entrySet(),getKey(),getValue()等等的方法。
			System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());  // Entry<K,V>，它表示Map中的一個物體（一個key-value對），介面中有getKey(),getValue方法
		}
	}
}
