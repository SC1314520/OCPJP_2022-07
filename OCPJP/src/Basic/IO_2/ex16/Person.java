package Basic.IO_2.ex16;

import java.io.Serializable;
/*
 * 	  static: 靜態關鍵字  --> 不可被序列化。  --> 共用
 *    transient : 瞬態關鍵字 --> 不可被序列化 --> 不共用
 */
public class Person implements Serializable{ // 標記型介面 --> 無需覆寫任何方法
	private String name;
	private int age;  
	public Person() {
	
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
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
