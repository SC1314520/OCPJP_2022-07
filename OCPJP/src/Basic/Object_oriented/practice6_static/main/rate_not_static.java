package Basic.Object_oriented.practice6_static.main;

import Basic.Object_oriented.practice6_static.method.rate_method_not_static;

public class rate_not_static { // 非static寫法
	public static void main(String[] args) {
		rate_method_not_static rm1=new rate_method_not_static(10000,0.01,5);
		rm1.calc();
		rate_method_not_static rm2=new rate_method_not_static(10000,0.012,4);
		rm2.calc();
		rate_method_not_static rm3=new rate_method_not_static(10000,0.013,3);
		rm3.calc();
		rate_method_not_static rm4=new rate_method_not_static(10000,0.014,2);
		rm4.calc();
	}
}
