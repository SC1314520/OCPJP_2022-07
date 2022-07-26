package Basic.Object_oriented.practice6_static.main;

import Basic.Object_oriented.practice6_static.method.rate_method_static_pro_max;


public class rate_static_pro_max {  // static寫法  --> 優化寫法
	public static void main(String[] args) {
		
		
		rate_method_static_pro_max rm1=new rate_method_static_pro_max(0.01,5);  // static 屬性不須放入建構子
		rate_method_static_pro_max rm2=new rate_method_static_pro_max(0.012,4); // static 屬性不須放入建構子
		rate_method_static_pro_max rm3=new rate_method_static_pro_max(0.013,3); // static 屬性不須放入建構子
		rate_method_static_pro_max rm4=new rate_method_static_pro_max(0.014,2); // static 屬性不須放入建構子
		rate_method_static_pro_max.setMoney(10000);
		rm1.calc();
		rm2.calc();
		rm3.calc();
		rm4.calc();
	}
}
