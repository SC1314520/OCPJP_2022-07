package Basic.Collections.api.demo2;

public class Person implements Comparable<Person>  {
	private String name;
	private int age;
	public Person() {

	}
	public Person(String name, int age) {
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
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Person o) {
		//return 0;  --> 認為元素都相同
		System.out.println("參數： "+o);
		return this.getAge()-o.getAge();  // 年齡升序排序。 相反則降序。  --> 自己-參數（升序） 參數-自己（降序）
	}
	
	
}
