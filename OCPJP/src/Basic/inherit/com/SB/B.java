package Basic.inherit.com.SB;

import Basic.inherit.com.SA.student1;
import Basic.inherit.com.SA.student2;

public class B extends student1 implements student2 {
	private int eng;
	public B(String name,int eng) {
		super(name);
		this.eng=eng;
	}
	@Override
	public void skill() {
		// TODO Auto-generated method stub
		
	}
}
