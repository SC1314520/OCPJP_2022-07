package Basic.inherit.demo_7_interface;

public class test {
	public static void main(String[] args) {
		System.out.println(book.pi); // 因為 pi 是 static，所以可以直接呼叫(無須 new 物件)。
		// book.pi=3.14159 --> 因為 pi 是 final，所以不可以更改。
		
		bookStore b =new bookStore();
		System.out.println(b.bookPrice(1000)); // 950.0
		b.bookName("java11"); // book: java11
		
		bookStore2 b2 =new bookStore2();
		System.out.println(b2.bookPrice(2000)); // 1900.0
		b2.bookName("java web"); // book2: java web
		
		
		// java 8
		b.CompanyName("company1");  // 物件類呼叫
		book.CompanyName2("company2"); // 介面類別類呼叫 
		// b.CompanyName2("company2");   <-- 介面類別不可這樣寫。
	}
}
