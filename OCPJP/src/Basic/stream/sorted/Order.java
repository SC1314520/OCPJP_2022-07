package Basic.stream.sorted;

public class Order implements Comparable<Order>{ // 物件 sorted 須實作 Comparable
	
	private String name;
	private Integer sum;
	public Order(String name, Integer sum) {
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
	
	public int compareTo(Order o) {
		// TODO Auto-generated method stub
		return this.sum-o.sum; // 由小排到大。
	}


}

