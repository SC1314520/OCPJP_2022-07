package exam;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ex38_i {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	 List<String> list=List.of("Mary","had","a","little","lamb");
	 Set<String> set=new HashSet<>(list);
	 		// System.out.println(list); // [Mary, had, a, little, lamb]
			 set.addAll(list); // Adds all of the elements in the specified collection to this set if they're not already present (optional operation).
			// System.out.println(list); // [Mary, had, a, little, lamb]
	for(String sheep:set) // -- (1)
		if(sheep.length()>1) 
			set.remove(sheep); // -- (1)   -->兩個會產生執行序衝突 java.util.ConcurrentModificationException

}
}
/*
What does the following output?
18: List<String> list=List.of(
19:  "Mary","had","a","little","lamb");
20:	Set<String> set=new HashSet<>(list);
21: set.addAll(list);
22: for(String sheep:set)
23:		if(sheep.length()>1)
24:			set.remove(sheep);
25: System.out.println(set);

A. [a.lamb,had,Mary,little]
B. [a]
C. [a,a]
D. The code does not compile.
E. The code throws an exception at runtime




ans:E.




*/