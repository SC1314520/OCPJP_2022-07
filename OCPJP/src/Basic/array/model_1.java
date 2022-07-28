package Basic.array;

import java.util.Arrays;

public class model_1 {
	public static void main(String[] args) {
		// not array
		int abc=123;
		int def=456;
		int ghi=789;
		
		System.out.println(abc);
		System.out.println(def);
		System.out.println(ghi);
		
		//--------------陣列宣告法-----------------//  
		// array-1
		int[] array=new int[3]; // new 給 default 初始值 --> 動態初始值
		//int array[] =new int[3];//也可以這樣寫！！
		array[0]=123;
		array[1]=456;
		array[2]=789;
		
		//array-2
		int[] arrays= {123,456,789};
		
		//array-3
		int[] arrayss=new int[] {}; //陣列長度為 0
		System.out.println(arrayss.length); //陣列長度為 0
		//System.out.println(arrayss[0]); -->java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
		int[] arraysss= {}; 
		System.out.println(arraysss.length); //陣列長度為 0
		//System.out.println(arraysss[0]); -->java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
		
		//----------------- for 迴圈運用-----------------------//
		
		// for loop
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		for(int i=0;i<arrays.length;i++) {
			System.out.println(arrays[i]);
		}
		// for-each loop
		for(int j : array) {
			System.out.println(j);
		}
		for(int k : arrays) {
			System.out.println(k);
		}
		
		
		//-----------------型態比大小-----------------------//
		int[] d =new int[3];
		for(int z:d) { // z的型態必須大於等於陣列型態。
			System.out.println(z); //0      
		}
		for(double z:d) { // double>int 所以可以這樣寫。
			System.out.println(z); // 0.0
		}
		
		
		//------------------包覆類別與基本型態互換 I----------------------//
		Integer[] i2= new Integer[3];
		for(Integer i :i2) {
			System.out.println(i); //null
		}
		//----------------------------------------//
		Integer[] i3= {1,2,3};
		for(int i:i3) { // Integer 可用 int 接收
			System.out.println(i); // 輸出: 1,2,3
		}
		//----------------------------------------//
		int[] i4 = {1,2,3};
		for(Integer i:i4) { // int 可用 Integer 接收
			System.out.println(i); //輸出: 1,2,3
		
		}
		
		//------------------包覆類別與基本型態互換 II ----------------------//
		Integer[] i5= new Integer[3]; // 基本型別不可接收 null !!!
		for(int i :i5) {
			//System.out.println(i); --> java.lang.NullPointerException
		}
	}
}
