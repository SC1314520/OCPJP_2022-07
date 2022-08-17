package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ex49_ii {
	public static void main(String[] args) {
		List<Employee> roster=new ArrayList<>();
		Predicate<Employee> p=e->e.getSalary()>30;
		Function<Employee,Optional<String>> f=
		      e->Optional.ofNullable(e.getNeighborhood());
		      // f 要跟 key 類型相同。
		      // groupingBy(function,Collectors)
		      Map<Optional<String>,List<Employee>> r4=roster.stream()
		    	       .collect(Collectors.groupingBy(f,Collectors.filtering(p,Collectors.toList())));
	}
}
class Employee {
	private String name;
	private String neighborhood;
	private int salary;
	public Employee(String name, String neighborhood, int salary) {
		super();
		this.name = name;
		this.neighborhood = neighborhood;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", neighborhood=" + neighborhood + ", salary=" + salary + "]";
	}
	
}
/*
Given:

public class Employee {
	private String name;
	private String neighborhood;
	private int salary;
	//Constructors and setter and getter methods go here
}

and the code fragment:

List<Employee> roster=new ArrayList<>();
Predicate<Employee> p=e->e.getSalary()>30;
Function<Employee,Optional<String>> f=
      e->Optional.ofNullable(e.getNeighborhood());

Which two objects group all employees with a salary greater than 30 by neighborhood?

A) Map<Optional<String>,List<Employee>> r4=roster.stream()
       .collect(Collectors.groupingBy(f,Collectors.filtering(p,Collectors.toList())));
       
B) Map<Optional<String>,List<Employee>> r2=roster.stream().filter(p)
       .collect(Collectors.groupingBy(f,Employee::getNeighborhood));//後者是 String 

C) Map<Optional<String>,List<Employee>> r5=roster.stream()
		    	       .collect(Collectors.groupingBy(Employee::getNeighborhood,
		    	               Collectors.filtering(p,Collectors.toList())));//前者是 String 

D) Map<Optional<String>,List<Employee>> r3=roster.stream().filter(p)
       .collect(Collectors.groupingBy(p));// 改成 groupingBy(f) 即可。
       
E) Map<String,List<Employee>> r1=roster.stream()
       .collect(Collectors.groupingBy(Employee::getNeighborhood,
               Collectors.filtering(p,Collectors.toList())));




ans:AE
*/
