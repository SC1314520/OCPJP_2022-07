package Basic.Collections.List.ArrayList;

import java.util.ArrayList;

public class demo4 {
	/*
	 *  JDK 1.5 以後
	 *  自動裝箱 基本-->包裝
	 *  自動拆箱 包裝-->基本
	 */
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		//<> 不可放入 int,double....的基本類型 -->必須使用包覆類別。
		ArrayList<Integer> list2 =new ArrayList<>();
		list2.add(100);
		list2.add(200);
		
		System.out.println(list2); //[100, 200]
		int num =list2.get(0); // 可用 int 接收。
		System.out.println(num); // 100
	}
}
