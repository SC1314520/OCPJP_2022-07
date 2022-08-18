package Basic.Concurrency_2.demo1;

public class student extends Thread {
	String name;

	public student(String name) {
	
		this.name = name;
	}
	
	
	
	@Override
	public void run() {
		
		for(int i=0;i<20;i++) {
			try {
				sleep(350); // 200ms
				System.out.println("i= "+i+" name= "+name);
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			} 
			
		}
	}



	public String show() {
		return "name:"+name;
	}
}
