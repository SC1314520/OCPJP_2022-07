package Basic.annotation.override;

public class cat {
	private String name;
	private int age;
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
	@Override //檢查是否覆寫父類別的方法
	public String toString() {
		return "cat [name=" + name + ", age=" + age + "]";
	}
	
}
