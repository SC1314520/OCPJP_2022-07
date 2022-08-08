package Basic.inherit.demo_6_abstract.ex;

public class test {
	public static void main(String[] args) {
		student[] s =new student[2];
		s[0]=new A("a",70);
		s[1]=new B("b",65);
		for(student i:s) {
			System.out.println(i.show());
		}
		s[0].set(80);
		s[1].set(75);
		for(student i:s) {
			System.out.println(i.show());
		}
		
		
	}
}
