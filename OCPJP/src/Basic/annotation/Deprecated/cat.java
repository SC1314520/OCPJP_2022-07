package Basic.annotation.Deprecated;

public class cat {
	private String name;
	private int age;
	
	public cat() {
		
	}
	public cat(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override 
	public String toString() {
		return "cat [name=" + name + ", age=" + age + "]";
	}
	
	@Deprecated // 用於標記方法已經過時，不建議使用了。
	public String printInfo() {
		return "cat [name=" + name + ", age=" + age + "]";
	}
}
