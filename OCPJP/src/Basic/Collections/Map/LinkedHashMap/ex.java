package Basic.Collections.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ex {
	public static void main(String[] args) {
		HashMap<String, String> map =new HashMap<>();
		map.put("a", "b");
		map.put("d", "g");
		map.put("c", "h");
		map.put("e", "i");
		map.put("f", "j");
		System.out.println(map); // {a=b, c=h, d=g, e=i, f=j} --> 無序且不重複。
	
		HashMap<String, String> map2 =new LinkedHashMap<>();
		map2.put("a", "b");
		map2.put("d", "g");
		map2.put("c", "h");
		map2.put("e", "i");
		map2.put("f", "j");
		System.out.println(map2); // {a=b, d=g, c=h, e=i, f=j} --> 有序且不重複。
	}
}
