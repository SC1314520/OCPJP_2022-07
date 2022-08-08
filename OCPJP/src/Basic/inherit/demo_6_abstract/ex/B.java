package Basic.inherit.demo_6_abstract.ex;

public class B extends student{
	private int eng;
	public B(String name, int eng) {
		super(name);
		this.eng=eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setChi(int chi) {
	
	}
	public String show() {
		return super.show()+" eng: "+eng;
	}
	
}
