package Basic.inherit.demo_3_FieldandMethod;

public class Company {
	private String name;
	private String address;
	public Company() {
		
	}
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
	public void change(String name) { // overload
		this.name=name;
	}
	public void change(String name,String address) { // overload
		this.name=name;
		this.address=address;
	}
	public void skill(int n) {
		System.out.println("n= "+n);
	}
	
}
