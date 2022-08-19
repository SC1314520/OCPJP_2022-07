package Basic.Collection2.generics.list.obj;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;


public class ex4 {
	public static void main(String[] args) {
		PriorityQueue<student4> h =new PriorityQueue<>();   // 可重複且自訂順序
		// 須在物件中覆寫 Comparable 介面中 compareTo(student4 o) 方法。 --> 這樣物件才能自訂順序
		// 不覆寫一定會出錯！！
		h.add(new student4("a1", 10, 50));
		h.add(new student4("a1", 20, 60));
		h.add(new student4("a1", 30, 80));
		h.add(new student4("a1", 40, 70));
		
		for(student4 x:h) {
			x.show();
		}
		
		
		// 也可以在主方法中覆寫 Comparator 中 compare(student4 o1, student4 o2) 方法。
		// 匿名寫法
		Comparator<student4> c = new Comparator<student4>() {
		
			@Override
			public int compare(student4 o1, student4 o2) {
			
				return o1.getSum()-o2.getSum(); // 降序
			}
			
		};
		h.stream().sorted(c).forEach(o->o.show());
		
		// lambda 寫法
		h.stream().sorted((o1,o2)->o1.getSum()-o2.getSum()).forEach(o->o.show());
		
		// peek 寫法
		h.stream().sorted(c).peek(o->o.show()).collect(Collectors.toList());
	}
}
