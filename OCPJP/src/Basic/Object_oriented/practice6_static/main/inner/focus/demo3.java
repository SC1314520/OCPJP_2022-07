package Basic.Object_oriented.practice6_static.main.inner.focus;


interface book2{
	public void bookName(String name);
	public double bookPrice(double price);
}
// 匿名方法
public class demo3 {
	public static void main(String[] args) {
		book2 b =new book2(){ // class ? implements book2{}

			@Override
			public void bookName(String name) {
				System.out.println(name);
				
			}

			@Override
			public double bookPrice(double price) {
				
				return price*0.95;
			}};
		b.bookName("Java");
		System.out.println(b.bookPrice(1000));
		
		
		
		// 第二種寫法
		
		new book2() {
			
			@Override
			public void bookName(String name) {
				System.out.println(name);
			}
			
			@Override
			public double bookPrice(double price) {
				return 0;
				
			}}.bookName("Java");
		
			
		System.out.println(new book2() {

			@Override
			public void bookName(String name) {
			
			
			}

			@Override
			public double bookPrice(double price) {
			
				return price*0.9;
			}
		
			}.bookPrice(3000));	
		}
}
