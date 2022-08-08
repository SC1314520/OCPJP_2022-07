package Basic.inherit.demo_6_abstract.ex;

public class A extends student{
	private int chi;
	public A(String name, int chi) {
		super(name);
		this.chi=chi;
	}
	public void setChi(int chi) {
		this.chi = chi;
	}
	public void setEng(int eng) {
		
	}
	public String show() {
		return super.show()+" chi: "+chi;
	}
}
