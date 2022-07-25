package Basic.Object_oriented.practice3.main;

import Basic.Object_oriented.practice3.method.stu_method2;
/*
 *  建立物件步驟:
 *  	1. field 欄位
 *  	2. constructors 建構式
 *  	3. methods 方法
 */
public class stu2 {
	public static void main(String[] args) {
		stu_method2 stu =new stu_method2("john",90,100);//.......(1)
		stu.show();
		System.out.println("平均為: "+stu.avg()); // 參數來自於(1)
		System.out.println("平均為: "+stu.avg(90,100)); 
	}
}
