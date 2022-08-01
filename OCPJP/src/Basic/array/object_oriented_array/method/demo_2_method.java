package Basic.array.object_oriented_array.method;

public class demo_2_method {
	private String name;
	private String address;
	
	public demo_2_method(String name,String address) {
		this.name=name;
		this.address=address;
	}
	public String show() {
		return "姓名: "+name+" 地址: "+address;
	}
}
