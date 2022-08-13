package Basic.Concurrency.Thread.API;

public class MyThread2 extends Thread{
	
	public MyThread2() {
		
	}
	 MyThread2(String name){
		 super(name);
	 }
	@Override
	public void run() {
		// 獲取線程名稱
		System.out.println(Thread.currentThread().getName());
	}
	
}
