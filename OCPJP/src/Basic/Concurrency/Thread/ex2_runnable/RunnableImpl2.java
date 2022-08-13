package Basic.Concurrency.Thread.ex2_runnable;

public class RunnableImpl2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("Hello world");
		}
		
	}
	
}
