package Basic.inherit.demo_7_interface;

public class bookStore2 implements book{

	@Override
	public void bookName(String name) {
		
		System.out.println("book2: "+name);
		
	}

	@Override
	public double bookPrice(double price) {
		if(price>=2000) {
			return price*0.95;
		}
		else {
			return price;
		}
	}
}
