package Basic.Collection2.generics.map;

import java.util.TreeMap;

public class ex2 {
	public static void main(String[] args) {
		TreeMap<String, Integer> x = new TreeMap<>();
		x.put("Java", 10);
		x.put("python", 8);
		x.put("C++", 6);
		
		System.out.println(x); // {C++=6, Java=10, python=8}
	}
}
