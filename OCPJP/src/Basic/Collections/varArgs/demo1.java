package Basic.Collections.varArgs;

import java.util.Iterator;

/*
 *  可變參數：
 *  	當方法的參數列表數據類型已經確定，但參數的個數不確定，即可使用可變參數。
 * 	使用格式：定義方法時使用。
 * 		修飾符 返回值類型 方法名（數據類型...變量名）{}   -->變量名底層是陣列型態！！
 * 	原理：
 * 		可以 0（不傳遞）~多個參數
 * 	注意事項：
 * 		1.一個方法的參數列表，只能有一個可變參數。
 * 		2.如果方法的參數有多個，那麼可變參數必須寫在參數列表的末尾！！
 */
public class demo1 {
	public static void main(String[] args) {
		System.out.println(add("abc：",5,10,15,20,25,30));//105  
		System.out.println(add("def",10,20,30)); //60
	}
	public static int add(String name,int...arr) { // --> 可變參數放最後
		int x=0;
		System.out.println(arr); // [I@1dbd16a6   --> 陣列
		for(int i:arr) {
			x+=i;
		}
		return x;
	}
	/*
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	*/
	// 可變參數的終極寫法：
	public static int method(Object...obj) {
		return 0;
	}
	
}
