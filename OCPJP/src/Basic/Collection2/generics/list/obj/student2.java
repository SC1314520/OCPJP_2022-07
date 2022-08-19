package Basic.Collection2.generics.list.obj;

import java.util.Objects;

public class student2 {
	private String name;
	private int chi;
	private int eng;
	private int sum;
	public student2(String name, int chi, int eng) {
		this.name = name;
		this.chi = chi;
		this.eng = eng;
		this.sum=chi+eng;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChi() {
		return chi;
	}
	public void setChi(int chi) {
		this.chi = chi;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public void show() {
		System.out.println("student [name=" + name + ", chi=" + chi + ", eng=" + eng + ", sum=" + sum + "]"); 
	}
	@Override
	public int hashCode() {
		return Objects.hash(chi, eng, name, sum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student2 other = (student2) obj;
		return chi == other.chi && eng == other.eng && Objects.equals(name, other.name) && sum == other.sum;
	}
	
	
}
