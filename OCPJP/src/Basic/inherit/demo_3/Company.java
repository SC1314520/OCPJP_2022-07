package Basic.inherit.demo_3;

public class Company {
	String name;
	String address;
	public Company(String name) {
		this.name=name;
	}
	public Company(String name,String address) {
		this.name=name;
		this.address=address;
	}
	public String show() {
		return "name: "+name+" address: "+address;
	}
}
