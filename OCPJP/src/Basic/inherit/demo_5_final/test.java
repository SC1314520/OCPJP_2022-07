package Basic.inherit.demo_5_final;

public class test {
	public static void main(String[] args) {
		S1 s=new S1("John",10);
		System.out.println(s.show()); // name= John 
		// s.pi=3.15;  <-- final 不可更改
		System.out.println(s.show1()); // name= John Ruler: 10
	}
}
