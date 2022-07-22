package Basic.Object_oriented.practice3.main;

import Basic.Object_oriented.practice3.method.stu_method;

public class stu {
	public static void main(String[] args) {
		stu_method stu =new stu_method("john",90,100);
		stu.show();
		stu.change(100, 85);
		stu.show();
		
	}
}
