package Basic.inherit.demo_6_abstract;

public class CB extends Company {
	private int RAM;
	public CB(String name,int RAM) {
		super(name);
		this.RAM=RAM;
	}
	public String show() {
		return super.show()+" RAM: "+RAM;
	}
}
