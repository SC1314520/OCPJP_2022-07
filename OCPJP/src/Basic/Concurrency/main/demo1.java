package Basic.Concurrency.main;
/*
 * 
 * 併發： 指兩個或多個事件在同一個時間段內發生（交替執行）。
 * 
 * 並行： 指兩個或多個事件在同一時刻發生（同時發生）。
 * 
 * 	主線程： 執行主（main)方法的線程。
 * 
 * 	單線程程序： JAVA 程序中只有一個線程，執行從main方法開始，從上而下依序執行。
 */
public class demo1 {
	public static void main(String[] args) {
		Person p1 =new Person("aaa");
		p1.run();
		
		Person p2 =new Person("bbb");
		p2.run();
	}
	
	
}
