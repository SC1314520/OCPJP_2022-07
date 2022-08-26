package Basic.compare.comparator;

public class employee  {
	private String name;
	private int salary;
	public employee() {
	
		
	}
	public employee(String name, int salary) {
	
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
