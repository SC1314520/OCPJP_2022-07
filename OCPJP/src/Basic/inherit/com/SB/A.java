package Basic.inherit.com.SB;

import Basic.inherit.com.SA.student1;
import Basic.inherit.com.SA.student2;


public class A extends student1 implements student2{
	private int chi;
	public A(String name,int chi) {
		super(name);
		this.chi=chi;
	}
	public int getChi() {
		return chi;
	}
	public void setChi(int chi) {
		this.chi = chi;
	}
	@Override
	public void skill() {
		this.x1=10;
		this.x2=20; // 只有繼承的子類別可直接呼叫 x2 。
		System.out.println("I am skillA");
		
	}
	
	public String show()
	{
		return super.show()+"\t國文:"+chi;
	}
	
	@Override 
	public void setMath(int math) {
		if(math>=0 && math<=200) {
			this.math=math;
		}
	}
	
	
}
