package Basic.Collection2.generics.list.obj;

public class student {
	private String name;
	private int chi;
	private int eng;
	private int sum;
	public student(String name, int chi, int eng) {
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
	
	
}
