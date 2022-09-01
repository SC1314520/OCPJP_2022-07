package Basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class fight2 {
	public static void main(String[] args) {
//		List<Integer> list2 =new ArrayList<>();
//		list2.add(1);
//		list2.add(2);
//		list2.add(3);
//		Iterator<Integer> it = list2.iterator();
//		while(it.hasNext()) {
//			if(it.next()==2) {
//				list2.remove(2);
//				System.out.println(it.next()); // java.util.ConcurrentModificationException  （16,17衝突）
//			}
//			
//		}
		List<Integer> list2 =new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		Iterator<Integer> it = list2.iterator();
		while(it.hasNext()) {
			int i =it.next(); // java.util.ConcurrentModificationException (27,28衝突）
			//list2.add(i);
			list2.remove(i);
//			System.out.println(list2.get(i)); <-- 超出範圍
			System.out.println(list2.get(i-1));
		}
	}
}
