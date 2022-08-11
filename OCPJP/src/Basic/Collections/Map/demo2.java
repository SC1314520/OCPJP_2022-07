package Basic.Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 *   第一種方式： 通過key找value
 *   第二種方法：
 *   	Set<K> keySet() 返回 Set
 *   步驟：
 *   	1. 使用 Map 集合中的 keySet() 方法，將Map集合中的所有key取出，存放在一個Set中。
 *   	2. 輸出 Set 集合，獲取 Map 中的每一個 key。
 *   	3. 通過 Map 集合中的 get(key)，找到value。
 */
public class demo2 {
	public static void main(String[] args) {
		Map<String, Integer> map =new HashMap<>();
		map.put("aaa", 168);
		map.put("bbb", 165);
		map.put("ccc", 178);
		
		Set<String> set =map.keySet();
		Iterator<String> it =set.iterator();
		while(it.hasNext()) {
			String key=it.next();
			Integer value =map.get(key);
			System.out.println(value); // 168 178 165
		}
		
		for(String key:set) {
			System.out.println(key+"  "+map.get(key));
		}
	}
}
