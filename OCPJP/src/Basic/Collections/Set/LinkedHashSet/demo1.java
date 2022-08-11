package Basic.Collections.Set.LinkedHashSet;
/*
 * 
 *  LinkedHashSet extends HashSet
 * 	元素有序！！
 * 
 */

import java.util.HashSet;
import java.util.LinkedHashSet;

public class demo1 {
	public static void main(String[] args) {
		HashSet<String> set =new HashSet<>();
		set.add("abc");
		set.add("abc");
		set.add("ghi");
		set.add("def");
		
		System.out.println(set); //[abc, def, ghi]  --> 無序且不重複
		
		
		LinkedHashSet<String> linked =new LinkedHashSet<>();
		linked.add("111");
		linked.add("131");
		linked.add("151");
		linked.add("171");
		linked.add("151");
		
		System.out.println(linked); //[111, 131, 151, 171] -->有序且不重複。
	}
	
	
}
