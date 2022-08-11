package Basic.inherit.com.SB;

import Basic.inherit.com.SA.student1;
import Basic.inherit.com.SA.student2;

public class B extends student1 implements student2 {
	private int eng;
	public B(String name,int eng) {
		super(name);
		this.eng=eng;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	@Override
	public void skill() {
		
		System.out.println("I am skillB");
		
	}
	
	public String show()
	{
		return super.show()+"\t英文:"+eng;
	}
}
