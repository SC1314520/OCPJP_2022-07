package Basic.Object_oriented.practice6_static.main;

import Basic.Object_oriented.practice6_static.method.rate_method_static;

public class rate_static { // static寫法
	public static void main(String[] args) {
		
		//rm1.money=1000; ----> 需 new 以後，才能呼叫。  (fail)
		//rate_method_static.money=1000; --> 類別類在 compiler 即出現，故可以直接使用 Object.money 呼叫 static 屬性。 (success)
		
		rate_method_static rm1=new rate_method_static(10000,0.01,5);
		rate_method_static rm2=new rate_method_static(10000,0.012,4);
		rate_method_static rm3=new rate_method_static(10000,0.013,3);
		rate_method_static rm4=new rate_method_static(10000,0.014,2);
		
		rm1.calc();
		rm2.calc();
		rm3.calc();
		rm4.calc();
		
		System.out.println("================ static ===================");
		//rm1.money=5000; --> 當 rm1,rm2,rm3,rm4 其中一個money更改，其餘三者跟著改變。(不建議這樣寫)
		rate_method_static.money=5000; // static 物件類(大家所共用的屬性)，請使用 Object.money 呼叫。 --> 大家的 money 皆會改變。(這樣寫比較好)
		rm1.calc(); //本金: 5000 利率: 0.01 期數: 5 本利和: 5250.0
		rm2.calc(); //本金: 5000 利率: 0.012 期數: 4 本利和: 5240.0
		rm3.calc(); //本金: 5000 利率: 0.013 期數: 3 本利和: 5195.0
		rm4.calc(); //本金: 5000 利率: 0.014 期數: 2 本利和: 5140.0
		
		System.out.println("===========================================");
		
		
		rate_method_static rm5=new rate_method_static(10000,0.01,5);
		rate_method_static rm6=new rate_method_static(20000,0.012,4);
		rate_method_static rm7=new rate_method_static(30000,0.013,3);
		rate_method_static rm8=new rate_method_static(40000,0.014,2); //static　取最後一個修正值。
		
		rm5.calc();// 本金: 40000 利率: 0.01 期數: 5 本利和: 42000.0
		rm6.calc();// 本金: 40000 利率: 0.012 期數: 4 本利和: 41920.0
		rm7.calc();// 本金: 40000 利率: 0.013 期數: 3 本利和: 41560.0
		rm8.calc();// 本金: 40000 利率: 0.014 期數: 2 本利和: 41120.0
	}
}
