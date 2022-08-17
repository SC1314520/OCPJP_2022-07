package Basic.lambda.ex1;

public class ex {
	public static void show(method m) {
		m.method();
	}
	public static void main(String[] args) {
		
		// 匿名寫法
		show(new method() {
			
			@Override
			public void method() {
				System.out.println("my method");
				
			}
		});
		
		// lambda表達式
		show(()->{System.out.println("lambda");});
		
		// 簡化
		show(()-> System.out.println("lambda2"));
		
		// 另外寫法
		method m1=()->{System.out.println("lambda3");};
		m1.method();
	}
}
