package Basic.Concurrency.Thread.API;
/*
 * 
 * 	主線程： main
 * 	新線程： Thread-0, Thread-1,Thread-2,.....
 * 
 */
public class demo2 {
	public static void main(String[] args) {
		MyThread2 mt =new MyThread2();
		// 命名一
		mt.setName("first"); // 設置線程名稱。
		mt.start();
		
		// 命名二
		new MyThread2("second").start(); //利用帶參方式將名稱傳給父類別（super(name))。
		
	}
	
}
