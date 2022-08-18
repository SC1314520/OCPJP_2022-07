package Basic.Collection2.generics.map;

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
		Set<Integer> set =map.keySet();
		Iterator<Integer> it =set.iterator();
		while(it.hasNext()) {
			Integer key =it.next();
			System.out.println("key= "+key);
			System.out.println("value= "+map.get(key));
		}
		
		
		Set<Map.Entry<Integer, Integer>> entry =map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> it2 = entry.iterator();
		while(it2.hasNext()) {
			Map.Entry<Integer, Integer> me=it2.next();
			System.out.println("key= "+me.getKey());
			System.out.println("value= "+me.getValue());
		}
		
		
		map.entrySet().stream().forEach(i->System.out.println("key= "+i.getKey()+" value= "+i.getValue()));
		map.entrySet().stream().peek(j->System.out.println("key= "+j.getKey())).peek(i->System.out.println(" value= "+i.getValue())).collect(Collectors.toList());
	}
}
