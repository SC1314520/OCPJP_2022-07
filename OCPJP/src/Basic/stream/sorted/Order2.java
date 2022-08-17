package Basic.stream.sorted;

public class Order2 {
	
	private String name;
	private Integer sum;
	
	public Order2(String name, Integer sum) {
		this.name = name;
		this.sum = sum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
	public void show() {
		System.out.println("name: "+name+" sum: "+sum);
	}
	
}
