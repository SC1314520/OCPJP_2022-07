package Basic.Object_oriented.practice3.method;

public class stu_method3 {  // getter and setter
	//封裝 Encapsulation
	private String name;
	private int chi,eng,sum;
	private double avg;
	//建構子
	public stu_method3() {
		
	}
	public stu_method3(String name, int chi, int eng) {
		super();
		if(chi>=0 && chi<=100 && eng>=0 && eng <=100) {
			this.name = name;
			this.chi = chi;
			this.eng = eng;
			sum =chi+eng;
		}
		
	}
	public void change(int chi ,int eng) {
		if(chi>=0 && chi<=100 && eng>=0 && eng <=100) {
			this.chi = chi;
			this.eng = eng;
			sum =chi+eng;
		}
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
		sum=eng+chi;
		return sum;
	}
	public double getAvg() {
		avg=(eng+chi)/2.;
		return avg;
	}
	@Override
	public String toString() {
		return "stu_method3 [name=" + name + ", chi=" + chi + ", eng=" + eng + ", sum=" + sum + ", avg=" + avg + "]";
	}
}
