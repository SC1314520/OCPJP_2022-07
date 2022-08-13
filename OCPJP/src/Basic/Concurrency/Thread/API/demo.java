package Basic.Concurrency.Thread.API;
/*
 * 
 * 	主線程： main
 * 	新線程： Thread-0, Thread-1,Thread-2,.....
 * 
 */
public class demo {
	public static void main(String[] args) {
		MyThread mt =new MyThread();
		
		mt.start();
		
		new MyThread().start();
		new MyThread().start();
		
		// 獲取線程名稱-3
		System.out.println(Thread.currentThread().getName()); // main
	}
	
}
