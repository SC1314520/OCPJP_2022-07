package Basic.inherit.ex.demo2_polychange;

public class test {
	public static void main(String[] args) {
		Base b1 =new DerivedB();
		Base b2 =new DerivedA();
		Base b3 =new DerivedB();
		b1=(Base)b3;   //--> b1 的實體是 b3 --> Derived B
		Base b4 =(DerivedA)b3;  // --> b4 的實體是 b3 --> Derived B
		// 只可以向上轉型，如: 不可以撰寫 (DerivedB)b2;
		b1.test(); // Derived B  --> 找實體判定即可
		b4.test(); // Derived B  --> 找實體判定即可
	}
}
