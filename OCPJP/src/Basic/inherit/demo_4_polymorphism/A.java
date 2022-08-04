package Basic.inherit.demo_4_polymorphism;

public class A extends school{
	private int chi;
	public A(String name,int chi) {
		super(name);
		this.chi=chi;
	}
	public String show() {
		return super.show()+" chi: "+chi;
	}
	public void skillA() {
		System.out.println("I AM skillA!");
	}
}
