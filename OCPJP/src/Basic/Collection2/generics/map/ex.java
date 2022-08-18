package Basic.Collection2.generics.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ex {
	public static void main(String[] args) {
		Map<Integer, Integer> map =new HashMap<>();
		map.put(1, 2);
		map.put(3, 4);
		map.put(5, 6);
		map.put(7, 8);   // 被覆蓋
		map.put(7, 10);  // 後者會覆蓋前者。
		
		// 方法一 --> keySet+iterator
		Set<Integer> set =map.keySet();
		Iterator<Integer> it =set.iterator();
		while(it.hasNext()) {
			Integer key =it.next();
			System.out.println("key= "+key);
			System.out.println("value= "+map.get(key));
		}
		// 方法二 --> for-each
		for(Integer i:set) {
			System.out.println("key= "+i);
			System.out.println(" value= "+map.get(i));
		}
		
		// 方法三  -->  抓值法
		Collection<Integer> v = map.values();
		for(Integer i:v) {
			System.out.println("value= "+i);
		}
		
		// 方法四 --> entrySet+iterator
		Set<Map.Entry<Integer, Integer>> entry =map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> it2 = entry.iterator();
		while(it2.hasNext()) {
			Map.Entry<Integer, Integer> me=it2.next();
			System.out.println("key= "+me.getKey());
			System.out.println("value= "+me.getValue());
		}
		
		// 方法五 --> stream with forEach
		map.entrySet().stream().forEach(i->System.out.println("key= "+i.getKey()+" value= "+i.getValue()));
		
		// 方法六 --> stream with peek
		map.entrySet().stream().peek(j->System.out.println("key= "+j.getKey()))
		.peek(i->System.out.println(" value= "+i.getValue())).collect(Collectors.toList());
	}
}
