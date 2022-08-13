package Basic.Concurrency.Thread.API;

public class MyThread extends Thread{

	@Override
	public void run() {
		// 獲取線程名稱-1
		String name=getName();
		System.out.println(name); // Thread-0
		// 獲取線程名稱-2
		Thread t =Thread.currentThread(); 
		System.out.println(t); // Thread[Thread-0,5,main]
		String name2=t.getName();
		System.out.println(name2); // Thread-0
	
	}
	
}
