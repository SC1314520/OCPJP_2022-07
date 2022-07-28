package Basic.Object_oriented.practice3_encapsulation.main;

import Basic.Object_oriented.practice3_encapsulation.method.order_method;

public class order {
	public static void main(String[] args) {
		//無參建構子寫法
		order_method od=new order_method();
		System.out.println(od.add(10,15));  // 姓名:null 鉛筆: 10 支 尺: 15 把 總計: 400 元
		System.out.println(od.add("Tony",10,15)); // 姓名:Tony 鉛筆: 10 支 尺: 15 把 總計: 400 元
		od.show(); // 姓名:null 鉛筆: 0 支 尺: 0 把 總計: 0 元 --> 因無賦予引數進行運算。 
		od.show("Tony",10,15); //姓名:Tony 鉛筆: 10 支 尺: 15 把 總計: 400 元
		
		//帶參建構子寫法
		order_method od2 =new order_method("Tony",10,15);
		od2.show(); //姓名:Tony 鉛筆: 10 支 尺: 15 把 總計: 400 元 --> 因為 od2 已將全域變數賦予值，故此方法接收到全域變數數值進行運算。
		od2.show("Mary",-10,15); //姓名:Mary 鉛筆: 10 支 尺: 15 把 總計: 400 元 --> 方法運算採區域變數而非全域變數(亦即運算子找尋最近的{}括號內的變數)。
	}
	
}
