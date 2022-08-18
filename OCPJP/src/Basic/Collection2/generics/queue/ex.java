package Basic.Collection2.generics.queue;

import java.util.PriorityQueue;

public class ex {
	public static void main(String[] args) {
		PriorityQueue<Integer> x =new PriorityQueue<>(); // 可重複、無序、自訂排序
		for(int i=0;i<=10;i++) {
			x.add(i);
			x.add(10-i);
		}
		x.stream().sorted().forEach(i->System.out.print(i+" "));
	}
}
