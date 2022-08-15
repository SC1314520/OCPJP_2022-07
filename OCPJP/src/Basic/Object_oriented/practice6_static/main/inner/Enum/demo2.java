package Basic.Object_oriented.practice6_static.main.inner.Enum;

import java.util.Arrays;

/*
 *  Enum: Java 6 以上以前只可以存放 String ， Java 7 以後可以以物件方式儲存。
 * 		1. 只能存放值
 * 		2. 本身與內容皆具有： public static final
 * 		3. 可稱作沒有名字的陣列：  Values() --> 轉陣列
 * 		4. 可搭配建構子 --> 須設定 private
 */
public class demo2 {
	public static void main(String[] args) {
		System.out.println(product2.java7); // java 7
		System.out.println(product2.valueOf("java8")); // java8
		System.out.println(product2.values()); // [LBasic.Object_oriented.practice6_static.main.inner.Enum.product2;@7ad041f3 --> 一維陣列。
		System.out.println(Arrays.toString(product2.values()));// [java7, java8, javaWeb]
		System.out.println(product2.values()[2]); // javaWeb
		
		for(product2 i:product2.values()) { // i 的型態為 product2
			System.out.println(i);
		}
		for(int i=0;i<product2.values().length;i++) {
			System.out.println(product2.values()[i]);
		}
		
		product2[] p = product2.values();
		System.out.println(p);
		System.out.println(Arrays.toString(p));
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
	}
}
// product2[] ? =new product2[]{ java7,java8,javaWeb };
enum product2{ // 陣列型態
	java7,java8,javaWeb  
}
