package Basic.Object_oriented.practice3.main;

import Basic.Object_oriented.practice3.method.stu_method;
/*
 *  建立物件步驟:
 *  	1. field 欄位
 *  	2. constructors 建構式
 *  	3. methods 方法
 */
public class stu {
	public static void main(String[] args) {
		stu_method stu =new stu_method("john",90,100);
		stu.show();
		stu.change(100, 85);
		stu.show();
		
	}
}
