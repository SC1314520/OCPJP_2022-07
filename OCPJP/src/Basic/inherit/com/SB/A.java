package Basic.inherit.com.SB;

import Basic.inherit.com.SA.student1;
import Basic.inherit.demo_8_interfaceEx.school2;

public class A extends student1 implements school2{
	private int chi;
	public A(String name,int chi) {
		super(name);
		this.chi=chi;
	}
	@Override
	public void show1() {
		// TODO Auto-generated method stub
		
	}
}
