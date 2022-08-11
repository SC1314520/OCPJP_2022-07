package Basic.inherit.com.SC;

import Basic.inherit.com.SA.student1;
import Basic.inherit.com.SA.student2;
import Basic.inherit.com.SB.A;
import Basic.inherit.com.SB.B;

public class test {
	public static void main(String[] args) {
		
		student1 s1=new student1("abc");
		System.out.println(s1.show());
		
		// 介面多型陣列
		student2[] s2=new student2[2];
		s2[0]=new A("John", 10);
		s2[0].skill();
		
		s2[1]=new B("Mary", 20);
		s2[1].skill();
		
		
		A a1=new A("aa",85);
		System.out.println(a1.show());
		a1.skill();
		a1.setMath(120); // 0~200
		System.out.println(a1.getMath());
		
		B b1=new B("bb",70);
		System.out.println(b1.show());
		b1.skill();
		b1.setMath(100); // 0~100
		System.out.println(b1.getMath());
		
	}
}
