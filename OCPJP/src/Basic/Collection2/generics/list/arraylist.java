package Basic.Collection2.generics.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		for(int i=0;i<=100;i+=10) {
			list.add(i);
		}
		System.out.println(list); //[0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		for(int i=100;i>=0;i-=10) {
			list.add(i);
		}
		System.out.println(list); // [0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0]
		
		Collections.sort(list);
		System.out.println(list); // [0, 0, 10, 10, 20, 20, 30, 30, 40, 40, 50, 50, 60, 60, 70, 70, 80, 80, 90, 90, 100, 100]
		Collections.reverse(list);
		System.out.println(list); // [100, 100, 90, 90, 80, 80, 70, 70, 60, 60, 50, 50, 40, 40, 30, 30, 20, 20, 10, 10, 0, 0]
		
		list.stream().filter(i->i>=50).sorted().peek(i->System.out.print(i+" ")).collect(Collectors.toList()); // 50 50 60 60 70 70 80 80 90 90 100 100 
		System.out.println();
		
		for(int o:list) {
			System.out.print(o+" "); //100 100 90 90 80 80 70 70 60 60 50 50 40 40 30 30 20 20 10 10 0 0 
		}
		
		System.out.println();
		Iterator<Integer> it =list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" "); // 100 100 90 90 80 80 70 70 60 60 50 50 40 40 30 30 20 20 10 10 0 0 
		}
		
		
	}
}
