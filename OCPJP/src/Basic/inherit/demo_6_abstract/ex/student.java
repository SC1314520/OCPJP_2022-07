package Basic.inherit.demo_6_abstract.ex;

abstract public class student {
	private String name;
	public student(String name) {
		this.name=name;
	}
	public String show() {
		return "name: "+name;
	}
	//abstract void setChi(int chi);
	//abstract void setEng(int eng);
	abstract void set(int x);
}
