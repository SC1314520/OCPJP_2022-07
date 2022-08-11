package Basic.Collections.Map;

import java.util.HashMap;
import java.util.Map;

/*
 * Map:
 *  1.Map 集合是一個雙列集合，（一個key , 一個 value)。
 * 	2.key,value 可以不同類型。
 * 	3.key不可重複，value 可以重複。
 * 	4.key和value是一一對應。
 * 
 * HashMap:
 * 	5. 底層是哈希表，查詢速度特別快！！
 * 	6. 無序集合，存儲與取出元素的順序可能不同。
 * 
 * LinkedHashMap extends HashMap
 * 	5. 底層是哈希表+鏈表 （保證迭代順序）
 * 	6. 有序集合，存儲與取出元素的順序一致。
 */

public class demo1 {
	public static void main(String[] args) {
		show1();
		show2();
		show3();
		show4();
	}
	
	public static void show1() {
		Map<String, String> map =new HashMap<>();
		String v1= map.put("AAA", "aaa");
		System.out.println(v1); // null   -->若key不重複，則返回null。
		String v2= map.put("AAA", "aaa");
		System.out.println(v2); // aaa  --> 若key重複，則返回被取代的value。
		
		System.out.println(map); // {AAA=aaa}
		
		map.put("BBB", "bbb");
		map.put("CCC", "ccc");
		map.put("DDD", "ccc"); // value 可重複。
		
		System.out.println(map); // {AAA=aaa, CCC=ccc, BBB=bbb, DDD=ccc}
	}
	
	public static void show2() {
		Map<String, Integer> map =new HashMap<>();
		map.put("aaa", 168);
		map.put("bbb", 165);
		map.put("ccc", 178);
		System.out.println(map); // {aaa=168, ccc=178, bbb=165}
		
		int v= map.remove("aaa");  // Integer 轉 int 自動拆箱，但若接收到 null，則產生錯誤
		System.out.println(v); // 168  --> 若key存在，則返回被刪除的value。
		
		Integer v2= map.remove("aaa");
		System.out.println(v2); // null   -->若key不存在，則返回null。
		
	}
	
	public static void show3() {
		Map<String, Integer> map =new HashMap<>();
		map.put("aaa", 168);
		map.put("bbb", 165);
		map.put("ccc", 178);
		Integer v = map.get("aaa");
		System.out.println(v); // 168
		Integer v2 = map.get("ddd");
		System.out.println(v2); // null
		
	}
	
	public static void show4() {
		Map<String, Integer> map =new HashMap<>();
		map.put("aaa", 168);
		map.put("bbb", 165);
		map.put("ccc", 178);
		boolean x =map.containsKey("aaa");
		System.out.println(x); // true
		boolean y =map.containsKey("ddd");
		System.out.println(y); // false
	}
	
}
