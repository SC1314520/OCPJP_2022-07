package Basic.Collections.Map.Entry;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo1 {
	public static void main(String[] args) {
		Map<String, Integer> map =new HashMap<>();
		map.put("aaa", 168);
		map.put("bbb", 165);
		map.put("ccc", 178);
		
		Set<Map.Entry<String, Integer>> set =map.entrySet();
		Iterator<Map.Entry<String, Integer>> it =set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry=it.next();
			String key =entry.getKey();
			Integer	value=entry.getValue();
			
			/* 不可以這樣寫：
			 *  String key =it.next().getKey();
			 * 	Integer value=it.next().getValue();
			 */
			System.out.println("key: "+key+ " value: "+value);
		}
		
		for(Map.Entry<String, Integer> entry:set) {
			String key =entry.getKey();
			Integer	value=entry.getValue();
			
			System.out.println("key: "+key+ " value: "+value);
		}
	}
}
