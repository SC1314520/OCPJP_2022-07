package exam;

import java.util.ArrayList;
import java.util.Iterator;

public class ex39_i {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		Iterator<Integer> itr=a1.iterator();
		while(itr.hasNext()) { // --(1)
			if(itr.next()==2) {
					a1.remove(2);
				System.out.print(itr.next()); // --(1) 會產生執行序衝突  java.util.ConcurrentModificationException
			}
		}
	}
	
}
/*
Given:

ArrayList<Integer> a1=new ArrayList<>();
a1.add(1);
a1.add(2);
a1.add(3);
Iterator<Integer> itr=a1.iterator();
while(itr.hasNext()) {
	if(itr.next()==2) {
			a1.remove(2);
		System.out.print(itr.next());
	}
}

What is the result?

A) 1 2 followed by an exception
B) 1 2 3 followed by an exception
C) A ConcurrentModificationException is thrown at run time
D) 1 2 4 5


ans:C
	


*/