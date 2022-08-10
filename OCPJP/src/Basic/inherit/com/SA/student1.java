package Basic.inherit.com.SA;

public class student1 {
	
	private String name;
	
	public student1(String name) {
		this.name=name;
	}
	
	student1(int x){  // 不同 package，不可呼叫此建構子。
		
	}
	
	public String show() {
		return "name: "+name;
	}
}
