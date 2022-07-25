package Basic.Object_oriented.practice3.method;

public class stu_method2 {  // 傳值法 (不使用 void)
	//封裝 Encapsulation
	private String name;
	private int chi,eng,sum;
	private double avg;
	//建構子
	public stu_method2(String name, int chi, int eng) {
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
	//方法
	public void show() { //不傳值
		System.out.println("name: "+name+" sum: "+sum);
	}
	public double avg() { //傳值(不帶參數) -->數值取用全域變數
		return (chi+eng)/2.;  // return 其實就等同於 = <--assignment ，且規則雷同(等號的左側類型需大於右側)
		// double avg = (chi+eng)/2.;
	}
	public double avg(int chi,int eng) { //傳值(帶參數) -->數值取用區域變數
		return (chi+eng)/2.;
	}
}
