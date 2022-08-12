package Basic.Object_oriented.practice6_static.main.inner.focus;


interface book{
	public void bookName(String name);
	public double bookPrice(double price);
}


public class demo2 implements book {
	public static void main(String[] args) {
		// book b1 = new book(); --> interface 不可 new 。 
		book b1 =new demo2(); // 可以以異質宣告的方式 new。
		demo2 d =new demo2();
		d.bookName("Java");
		System.out.println(d.bookPrice(1000));
	}

	@Override
	public void bookName(String name) {
		System.out.println(name);
	}

	@Override
	public double bookPrice(double price) {
		
		return price;
	}
}
