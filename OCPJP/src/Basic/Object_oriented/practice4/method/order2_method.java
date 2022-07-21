package Basic.Object_oriented.practice4.method;

public class order2_method {
	private int lcd,ram,mouse;
	public order2_method() {
		
	}
	public order2_method(int lcd, int ram, int mouse) {
		super();
		this.lcd = lcd;
		this.ram = ram;
		this.mouse = mouse;
	}
	public int sum(int lcd, int ram ,int mouse) {
		int sum = lcd*4999+ram*1280+mouse*799;
		return sum;
	}
}
