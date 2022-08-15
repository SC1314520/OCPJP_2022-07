package Basic.Object_oriented.practice6_static.main.inner.focus.lambda;


interface book2{
	public void bookName(String name);
}

public class ex {
	public static void main(String[] args) {
		// 匿名寫法
		book2 b =new book2() {
			
			@Override
			public void bookName(String name) {
				System.out.println(name);
				
			}
		};
		
		b.bookName("Java");
		new book2() {
			
			@Override
			public void bookName(String name) {
				System.out.println(name);
				
			}
		}.bookName("Java2");
		
		
		
		// Lambda 寫法:
		/*	介面中只有一個抽象方法，Java8 以後可以這樣寫！！
		 * 
		 */
		book2 b2= (String name)->{System.out.println(name);}; 
		book2 b3 =(name)->{System.out.println(name);}; // 單一引數
		book2 b4 =name->System.out.println(name);; // 單一引數
		b2.bookName("Java 3");
		b3.bookName("Java 4");
		b4.bookName("Java 5");
	}
}
