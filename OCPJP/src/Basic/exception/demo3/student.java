package Basic.exception.demo3;

public class student {
	String name;
	int chi;
	int eng;
	
	// 建構子跟方法也能撰寫 exception 拋出例外!!
	public student(String name, int chi, int eng) throws Exception{
		this.name = name;
		if(chi>=0 && chi<=100 && eng>=0 && eng<=100) {
			this.chi = chi;
			this.eng = eng;
		}else {
			throw new Exception();
		}
	}
	public String show() {
		return "name: "+name+" chi: "+chi+" eng: "+eng;
	}
	
	public int Sum(int chi,int eng) throws Exception { // 記得要加 throws Exception ----(1)
		
		if(chi>=0 && chi<=100 && eng>=0 && eng<=100) {
			this.chi=chi;
			this.eng=eng;
			
			return chi+eng;
		}
		else {
			throw new Exception(); // ----(1)
		}

	}
}
