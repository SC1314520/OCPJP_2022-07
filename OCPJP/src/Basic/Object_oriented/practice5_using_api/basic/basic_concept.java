package Basic.Object_oriented.practice5_using_api.basic;

import java.util.Scanner; //------(1)
import java.util.Date; // ------(2)
// 亦可寫成 java.util.* 取代上方兩者，但不建議使用。 --> 因為在 debug 時，會非常的不方便。

/*
 * Compiler
 * 	1.call by reference
 * 		a. 內部函式庫 --> java.lang.*
 * 		b. 同一資料夾 (package) ，否則須 import 。
 * 	2.call by value
 */

public class basic_concept {
	public static void main(String[] args) {	
		// ----------- java.lang.* (內部函式庫) 無須 import -----------//
		java.lang.Thread tr =new java.lang.Thread(); // 絕對路徑寫法 (此外，java.lang 系列的皆不用import，就可省略。因為系統編譯時，本身預設會先查 java.lang.* 函式庫)
		Thread tr2 =new Thread(); // 相對路徑寫法
		
		// ----------- 非 java.lang.* (外部函式庫)  需 import (此外， * 代表 import 該 package 以下的所有資源) -----------//
		java.util.Scanner sc =new java.util.Scanner(System.in); //絕對路徑寫法
		Scanner sc1 =new Scanner(System.in); // 相對路徑寫法，需import ------(1)
		Date date =new Date(); // 相對路徑寫法，需import ------(2)
		System.out.println(date);
	}
	
}
