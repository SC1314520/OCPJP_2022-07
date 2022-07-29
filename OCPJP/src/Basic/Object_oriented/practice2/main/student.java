package Basic.Object_oriented.practice2.main;

import java.util.Arrays;

import Basic.Object_oriented.practice2.method.method;

public class student{
	public static void main(String[] args) {
		method std = new method(); //物件變數
		std.add("mary",65,65); // void 寫法 (自行撰寫呼叫方法)
		std.add("Tony",65,75); // void 寫法 (自行撰寫呼叫方法)
		
		//
		/* 若只有宣告變數，而無賦予初始值，則編譯失敗。
		String name;
		System.out.println(name);
		*/
		/* new 本身有預設: 所以當物件無賦予初始值時，編譯不會失敗。
		 * int = 0
		 * double = 0.0
		 * String = null
		 * boolean = false
		 */
		//System.out.println(std.name); -->輸出為 null
		//System.out.println(std.chinese); -->輸出為 0
		//System.out.println(std.english); -->輸出為 0
		
		
		//
		String name="Tom";
		int chinese=70,english=80; //普通變數
		method std1=new method(name,chinese,english); //帶值的物件變數
		System.out.println(std1);// return 寫法，方法中無toString()，則顯示為hashcode位置。
		System.out.println(std1);// return 寫法，方法中有toString()，則顯示為字串。
		
		
	}
}
