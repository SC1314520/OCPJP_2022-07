package Basic.Concurrency.Thread.API;
/*
 * 
 * 	主線程： main
 * 	新線程： Thread-0, Thread-1,Thread-2,.....
 * 
 */
public class demo3_sleep {
	public static void main(String[] args) {
		
		
		for(int i=0;i<=60;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);// 毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
