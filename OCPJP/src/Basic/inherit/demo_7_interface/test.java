package Basic.inherit.demo_7_interface;

public class test {
	public static void main(String[] args) {
		System.out.println(book.pi); // 因為 pi 是 static，所以可以直接呼叫(無須 new 物件)。
		// book.pi=3.14159 --> 因為 pi 是 final，所以不可以更改。
	}
}
