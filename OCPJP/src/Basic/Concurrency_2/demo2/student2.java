package Basic.Concurrency_2.demo2;

class student{
	String name;

	public student(String name) {
	
		this.name = name;
	}
	public String show() {
		return "name:"+name;
	}
}

public class student2 extends student implements Runnable{
	private int chi;
	public student2(String name, int chi) {
		super(name);
		this.chi=chi;
	}
	public String show() {
		return super.show()+" chi:"+chi;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("i="+i+" "+show());
		}
	}
	
}
