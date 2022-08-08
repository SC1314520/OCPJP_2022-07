package Basic.inherit.demo_7_interface;

public class bookStore implements book{

	@Override
	public void bookName(String name) {
		
		System.out.println("book: "+name);
		
	}

	@Override
	public double bookPrice(double price) {

		return price*0.95;
	}

}
