package Basic.Collection2.generics.list.obj;

import java.util.HashSet;

public class ex2 {
	public static void main(String[] args) {
		HashSet<student2> h =new HashSet<>();  // --> Set 集合 無序且不可重複。
		// 須在物件中覆寫 hashCode() and equals() 方法。 --> 這樣物件才不會重複。
		h.add(new student2("a1", 10, 50));
		h.add(new student2("a1", 10, 50));
		h.add(new student2("a1", 10, 50));
		h.add(new student2("a1", 10, 50));
		
		for(student2 x:h) {
			x.show();
		}
	}
}
