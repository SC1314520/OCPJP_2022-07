package Basic.Object_oriented.practice6_static.main.inner.focus.lambda;


interface book4{
	
	public String bookStyle(String name, double price);
}

public class ex3 {
	public static void main(String[] args) {
		
		
		book4 b2 =cal::p1;
		System.out.println(b2.bookStyle("Java", -100)); // price need to be positive or free !!
		System.out.println(b2.bookStyle("Java2", 100)); // Java2 100.0
	}
}


class cal{
	public static String p1(String name, double price) {
		if(price>=0) {
			return name+" "+price;
		}
		else {
			return "price need to be positive or free !!";
		}
		
	}
}
