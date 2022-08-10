package Basic.inherit.com.SB;

import Basic.inherit.com.SA.student1;
import Basic.inherit.com.SA.student2;


public class A extends student1 implements student2{
	private int chi;
	public A(String name,int chi) {
		super(name);
		this.chi=chi;
	}
	@Override
	public void skill() {
		
		System.out.println("I am skillA");
		
	}
	
	public String show()
	{
		return super.show()+"\t國文:"+chi;
	}
}
