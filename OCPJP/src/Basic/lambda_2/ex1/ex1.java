package Basic.lambda_2.ex1;

interface book{
	// 常數
	public static final int x=10;
	// 抽象方法
	public abstract void bookName(String name);
	
	// 物件類方法
	public default void show1(String msg) {
		System.out.println(msg);
	}
	
	// 類別類方法
	public static void show2(String msg) {
		System.out.println(msg);
	}
	
}

public class ex1 {
	public static void main(String[] args) {
		
		// 匿名方法
		book b1=new book() {

			@Override
			public void bookName(String name) {
				System.out.println("name= "+name);
				
			}
			
		};
		b1.bookName("python");
		
		// lambda 寫法
		book b2=(str)->{System.out.println("name= "+str);};
		b2.bookName("java");
		
	}
}
