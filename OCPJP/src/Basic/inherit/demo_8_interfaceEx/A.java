package Basic.inherit.demo_8_interfaceEx;
// extends 在前，implement 在後
// class: extends 只能繼承一次 ，implements 可以多個
// interface: extends 可以繼承多個 interface
public class A extends school1 implements school2,school3  {  // 當繼承多個介面遇到同名方法時，只需 override 一次，如: show1()
	@Override
	public void show1() {
		System.out.println(school2.pi);
	}
	public void show2() {
		
	}
	public void show3() {
		
	}

}
