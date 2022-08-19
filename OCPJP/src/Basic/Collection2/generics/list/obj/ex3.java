package Basic.Collection2.generics.list.obj;


import java.util.TreeSet;

public class ex3 {
	public static void main(String[] args) {
		TreeSet<student3> h =new TreeSet<>();  
		// 須在物件中覆寫 Comparable 介面中 compareTo(student3 o) 方法。 --> 這樣物件才不會重複。
		h.add(new student3("a1", 10, 50));
		h.add(new student3("a1", 20, 60));
		h.add(new student3("a1", 30, 80));
		h.add(new student3("a1", 40, 90));
		
		for(student3 x:h) {
			x.show();
		}
	}
}
