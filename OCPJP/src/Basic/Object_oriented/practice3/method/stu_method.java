package Basic.Object_oriented.practice3.method;

public class stu_method {
	private String name;
	private int chi,eng,sum;
	private double avg;
	public stu_method(String name, int chi, int eng) {
		super();
		if(chi>=0 && chi<=100 && eng>=0 && eng <=100) {
			this.name = name;
			this.chi = chi;
			this.eng = eng;
			sum =chi+eng;
			avg = sum/2.; // 也可寫成 avg=(double)sum/2; ---> [#. 代表 double] 、 [#.f 代表 float]
		}
		
	}
	public void change(int chi ,int eng) {
		if(chi>=0 && chi<=100 && eng>=0 && eng <=100) {
			this.chi = chi;
			this.eng = eng;
			sum =chi+eng;
			avg = sum/2.;
		}
	}
	public void show() {
		System.out.println("name: "+name+" sum: "+sum+" avg: "+avg);
	}
}
