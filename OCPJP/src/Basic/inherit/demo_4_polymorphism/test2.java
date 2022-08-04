package Basic.inherit.demo_4_polymorphism;

public class test2 { // 多型陣列
	public static void main(String[] args) {
		school[][] x =new school[3][];
		x[0]=new school[3];
		x[1]=new school[4];

		x[0][0]=new A("a1",78);
		x[0][1]=new A("a2",78);
		x[0][2]=new A("a3",78);

		x[1][0]=new B("b1",78);
		x[1][1]=new B("b2",78);
		x[1][2]=new B("b3",78);
		x[1][3]=new B("b4",78);
	}
}
