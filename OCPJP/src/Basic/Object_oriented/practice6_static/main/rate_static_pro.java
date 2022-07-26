package Basic.Object_oriented.practice6_static.main;

import Basic.Object_oriented.practice6_static.method.rate_method_static;
import Basic.Object_oriented.practice6_static.method.rate_method_static_pro;

public class rate_static_pro {  // static寫法  --> 優化寫法
	public static void main(String[] args) {
		
		//rm1.money=1000; ----> 需 new 以後，才能呼叫。  (fail)
	    rate_method_static_pro.money=5000;  //--> 類別類在 compiler 即出現，故可以直接使用 Object.money 呼叫 static 屬性。 (success)
		
		rate_method_static_pro rm1=new rate_method_static_pro(0.01,5);  // static 屬性不須放入建構子
		rate_method_static_pro rm2=new rate_method_static_pro(0.012,4); // static 屬性不須放入建構子
		rate_method_static_pro rm3=new rate_method_static_pro(0.013,3); // static 屬性不須放入建構子
		rate_method_static_pro rm4=new rate_method_static_pro(0.014,2); // static 屬性不須放入建構子
		
		rm1.calc();
		rm2.calc();
		rm3.calc();
		rm4.calc();
		System.out.println(rate_method_static_pro.showString());
		System.out.println("10+20 總合為: "+rate_method_static_pro.sum(10,20));
	}
}
