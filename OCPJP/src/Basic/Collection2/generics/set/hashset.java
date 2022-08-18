package Basic.Collection2.generics.set;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {  // Set --> 資料不允許重複。
	public static void main(String[] args) {
		HashSet<Integer> set =new HashSet<>();
		for(int i=0;i<=10;i++) {
			set.add(i);
		}
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		set.stream().forEach(System.out::print); // 同一個 stream 只能使用一次。 
		
		System.out.println();
		
		for(int i:set) {  // set 無 index --> 只能用 for-each
			System.out.print(i+" ");
		}
	}
}
