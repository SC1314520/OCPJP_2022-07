package Basic.array.Arrays_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ex {
	public static void main(String[] args) {
		//-------------- Arrays.asList()----------------//
		List<Integer> list =new ArrayList<>(); // 可以利用 add() 的方式新增資料。
		
		List<Integer> list2 = Arrays.asList(1,2,3); // 不可新增資料 ....(1)
		// list2.add(4); --> java.lang.UnsupportedOperationException
		List<Integer> list3 =new ArrayList<>(list2); // 解決方法 ....(1)
		
		for(int i=0; i<10 ;i++) {
			list.add(i);
		}
		list3.add(4);
		System.out.println(list); // [0,1,2,3,4,5,6,7,8,9]
		System.out.println(list2); //[1,2,3]
		System.out.println(list3); // [1,2,3,4]
		
		//-------------- Array.copyOf()---------------//
		// Copies the specified array, truncating or padding with zeros (if necessary) so the copy has the specified length.
		// 語法： copyOf(int[] original, int newLength) --> 增加長度。
		int[] x =new int[] {1,2,3,4,5,6};
		int[] y =Arrays.copyOf(x, 10);
		System.out.println(Arrays.toString(y)); // [1, 2, 3, 4, 5, 6, 0, 0, 0, 0] --> 不足之處會補零
		for(int i=0;i<y.length;i++) {
			y[i]=i;
		}
		System.out.println(Arrays.toString(y));// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] 
		
		//-------------- Array.copyOfRange()---------------//
		// Copies the specified range of the specified array into a new array.
		// 語法： copyOfRange(int[] original, int from, int to)  --> (陣列,起始,結束） --> 同樣不包含 index of end
		int[] z=Arrays.copyOfRange(y, 0, 4);
		System.out.println(Arrays.toString(z)); // [0,1,2,3]
		z=Arrays.copyOfRange(y, 2, 5);
		System.out.println(Arrays.toString(z)); // [2,3,4]
		
		//-------------- Array.equals()---------------//
		// 語法：equals(int[] a, int[] a2)
		int[] a= {1,2,3,4};
		int[] b= {1,2,3,4};
		System.out.println(a==b);//false <--判定 hashCode
		System.out.println(a.equals(b));//false <--判定 hashCode
		System.out.println(Arrays.toString(a).equals(Arrays.toString(b))); // true <-- 判定 String
		System.out.println(Arrays.equals(a, b)); // true <-- Returns true if the two specified arrays of ints are equal to one another.
		a=b; // garbage collection --> pass by value --> b的 hashcode 傳遞給 a --> a 被回收。 --> 此時兩者指向同一個物件。
		System.out.println(a==b); // true
		System.out.println(a.equals(b)); // true
		a[0]=5; // a[0]改變 --> b[0] 跟著改變。
		System.out.println(b[0]); // 5
		b[1]=6; // b[1]改變 --> a[1] 跟著改變。
		System.out.println(a[1]); // 6
		
		//-------------- Array.fill()---------------//
		int[] c =new int[10];
		Arrays.fill(c, 10); // fill(int[] a, int val) <-- Assigns the specified int value to each element of the specified array of ints.
		System.out.println(Arrays.toString(c)); // [10, 10, 10, 10, 10, 10, 10, 10, 10, 10] 
		Arrays.fill(c,2,5,3); //<-- fill(int[] a, int fromIndex, int toIndex, int val) <-- Assigns the specified int value to each element of the specified range of the specified array of ints.
		System.out.println(Arrays.toString(c));  // [10, 10, 3, 3, 3, 10, 10, 10, 10, 10]
		
		//-------------- Array.sort()---------------//
		int[] random =new int[20];
		for(int i=0;i<random.length;i++) {
			random[i]=(int)(Math.random()*100+1); // 隨機取值。
		}
		Arrays.sort(random); // 由小排到大。
		System.out.println(Arrays.toString(random)); //[14, 18, 24, 25, 35, 36, 45, 48, 52, 64, 68, 72, 79, 79, 80, 80, 81, 90, 92, 95]
	}
}
