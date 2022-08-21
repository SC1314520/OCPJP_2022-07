package Basic.Collections.List.CopyOnWriteArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ex {
	//A thread-safe variant of ArrayList in which all mutative operations (add, set, and so on) are implemented by making a fresh copy of the underlying array.
	public static void main(String[] args) {
		List<Integer> list =new CopyOnWriteArrayList<>();
		// add(E e)  Appends the specified element to the end of this list.
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		System.out.println(list); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		// add​(int index, E element)
		list.add(5,11);
		System.out.println(list);// [0, 1, 2, 3, 4, 11, 5, 6, 7, 8, 9, 10]
		
		// addAll​(int index, Collection<? extends E> c)
		List<Integer> list2 =new CopyOnWriteArrayList<>();
		for(int i=0;i<5;i++) {
			list2.add(12);
		}
		list.addAll(0,list2);
		System.out.println(list); // [12, 12, 12, 12, 12, 0, 1, 2, 3, 4, 11, 5, 6, 7, 8, 9, 10]
		
		// indexOf​(E e, int index) Returns the index of the first occurrence of the specified element in this list, searching forwards from index, or returns -1 if the element is not found.
		// lastIndexOf​(E e, int index) Returns the index of the last occurrence of the specified element in this list, searching backwards from index, or returns -1 if the element is not found.
		System.out.println(list2.indexOf(12)); // 0
		System.out.println(list2.lastIndexOf(12)); // 4
		
		// clear()  Removes all of the elements from this list.
		list2.clear();
		System.out.println(list2); // []
		
		//isEmpty() Returns true if this list contains no elements.
		boolean b2 =list2.isEmpty();
		System.out.println(b2); // true
		
		
		// contains​(Object o) Returns true if this list contains the specified element.
		boolean b =list.contains(10);
		System.out.println(b); // true
		
		// size() Returns the number of elements in this list.
		// get​(int index) Returns the element at the specified position in this list.
		List<Integer> list3 =new CopyOnWriteArrayList<>();
		for(int i=0;i<list.size();i++) {
			list3.add(list.get(i));
		}
		
		// containsAll​(Collection<?> c)  Returns true if this list contains all of the elements of the specified collection.
		boolean b3 =list.containsAll(list3);
		System.out.println(b3); // true
		
		// remove​(int index) Removes the element at the specified position in this list.
		// remove​(Object o) Removes the [first] occurrence of the specified element from this list, if it is present.
		List<String> list4 =new CopyOnWriteArrayList<>();
		list4.add("John");
		list4.add("Jack");
		list4.add("Mary");
		list4.add("Jack");
		list4.add("Windy");
		System.out.println(list4); // [John, Jack, Mary, Jack, Windy]
		list4.remove(0);
		System.out.println(list4); // [Jack, Mary, Jack, Windy]
		list4.remove("Jack"); // --> 刪除第一個吻合的元素。
		System.out.println(list4); // [Mary, Jack, Windy]
		
		// set​(int index, E element) Replaces the element at the specified position in this list with the specified element.
		list4.set(0, "Kelly"); // 取代
		System.out.println(list4); // [Kelly, Jack, Windy]
		
		// toArray() Returns an array containing all of the elements in this list in proper sequence (from first to last element).
		Object[] arr=list4.toArray(); // 集合轉陣列
		System.out.println(arr); // [Ljava.lang.Object;@1dbd16a6
		System.out.println(Arrays.toString(arr));// [Kelly, Jack, Windy]
		
		// 	iterator() Returns an iterator over the elements in this list in proper sequence.
		Iterator<String> it =list4.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" "); // Kelly Jack Windy 
		}
		System.out.println();
		
		// forEach​(Consumer<? super E> action)  Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
		list4.forEach(i->System.out.print(i+" ")); // Kelly Jack Windy 
		System.out.println();
		list4.forEach(System.out::print); // KellyJackWindy
	}
}
