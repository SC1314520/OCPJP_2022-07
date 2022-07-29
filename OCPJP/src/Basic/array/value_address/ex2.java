package Basic.array.value_address;

import java.util.Arrays;

public class ex2 {
	public static void main(String[] args) {
		int[] x= new int[] {10,20,30}; // 長度為3，且不可增加長度!!
		// x[3]=10; --> java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		
		// 錯誤示範:
		System.out.println(x); //[I@7d6f77cc
		System.out.println(Arrays.toString(x)); // [10, 20, 30]
		x=new int[10]; // garbage collection --> 原先的陣列被回收。 (不可以這樣做唷!!)
		x[3]=10;
		System.out.println(x[3]); // 10
		System.out.println(x); // [I@5aaa6d82
		System.out.println(Arrays.toString(x)); // [0, 0, 0, 10, 0, 0, 0, 0, 0, 0]
		
	}
}
