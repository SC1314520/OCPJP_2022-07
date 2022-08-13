package Basic.Concurrency.Thread.ex1_thread;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("run: "+i);
		}
	}
}
