package Basic.inherit.ex.demo1;

public class Person {
	String name;
	int age=25;
	
	public Person (String name) {
		//this();  --> 因為本方法中無 無參建構子，故呼叫失敗。
		setName(name);
	}
	
	public Person(String name, int age) {
		this(name);
		// 不可以寫成 Person(name);
		
		setAge(age);
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
	
	
}
