package Basic.inherit.com.SA;

public class student1 {
	
	private String name;
	public int x1;
	protected int x2;
	protected int math;  // --> protected 只開放給子類別使用。
	
	public student1(String name) {
		this.name=name;
	}
	
	student1(int x){  // 不同 package，不可呼叫此建構子。
		
	}
	
	public String show() {
		return "name: "+name;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(math>-0 && math<=100) {
			this.math = math;
		}
	}
	
}
