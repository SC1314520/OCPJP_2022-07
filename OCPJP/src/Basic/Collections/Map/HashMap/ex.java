package Basic.Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ex {
	public static void main(String[] args) {
		show1();
		show2();
	}
	
	public static void show1() {
		HashMap<String, Person> map =new HashMap<>();  // 無需覆寫 hashCode(),equals()
		map.put("aaa",new Person("bbb",18));
		map.put("ccc",new Person("ddd",20));
		map.put("eee",new Person("fff",19));
		map.put("ggg",new Person("hhh",21));
		
		Set<String> set =map.keySet();
		
		for(String key:set) {
			Person value = map.get(key);
			System.out.println(key+"  "+value);
		}
	}
	
	public static void show2() {
		HashMap<Person,String> map =new HashMap<>(); // 必須覆寫 hashCode(),equals() --> 保證key唯一性。
		map.put(new Person("bbb",18), "aaa");
		map.put(new Person("ccc",21), "fff");
		map.put(new Person("ddd",17), "ggg");
		map.put(new Person("eee",22), "hhh");
		map.put(new Person("eee",22), "kkk"); // 須覆寫才會防止重複！！
		
		Set<Map.Entry<Person, String>> set =map.entrySet();
		Iterator<Map.Entry<Person, String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<Person, String> entry = it.next();
			Person key = entry.getKey();
			String value=entry.getValue();
			System.out.println(key+" "+value);
		}
		for(Map.Entry<Person, String> entry:set) {
			Person key = entry.getKey();
			String value=entry.getValue();
			System.out.println(key+" "+value);
		}
	}
	
}
