package Basic.lambda.ex3;

// Runnable 是函數式接口
public class ex {
	public static void startThread(Runnable run) {
		new Thread(run).start();
	}
	public static void main(String[] args) {
		
		// 匿名寫法
		startThread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
			}
		});
		
		// lambda 表達式
		startThread(()->{
			System.out.println(Thread.currentThread().getName());
		});
		
		// 另類寫法
		Runnable run2 =()->{System.out.println(Thread.currentThread().getName());};
		new Thread(run2).start();
		
		
	}
}
