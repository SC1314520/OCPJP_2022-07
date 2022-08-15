package Basic.Object_oriented.practice6_static.main.inner.focus.lambda;


interface book3{
	
	public String bookStyle(String name, double price);
}


public class ex2 { // Lambda -> return
	public static void main(String[] args) {
		book3 b=(String name, double price)->"書名: "+name+" 價格： "+price;  // -> 可表示 return
		System.out.println(b.bookStyle("Java", 200));
		
		book3 b2=(name, price)->"書名: "+name+" 價格： "+price; 
		System.out.println(b2.bookStyle("python", 150));
		
		
	}
}
