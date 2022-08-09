package Basic.exception.demo4;

class check extends Exception{
	
	public check(String msg){
		System.out.println("範圍須介於"+msg);
	}
	public check(String msg,int chi ,int eng) {
		System.out.println("chi: "+chi+" eng: "+eng+" 範圍須介於 "+msg);
	}
		
}

public class student2 {
	int chi;
	int eng;
	
	public int SumA(int chi,int eng) throws check{
		if(chi>=0 && chi<=100 && eng>=0 && eng<=100) {
			this.chi=chi;
			this.eng=eng;
			
			return chi+eng;
		}else {
			throw new check("0~100");
		}
		
	}
	
	public int SumB(int chi,int eng) throws check{
		if(chi>=0 && chi<=200 && eng>=0 && eng<=200) {
		this.chi=chi;
		this.eng=eng;
		
		return chi+eng;
		}else {
			throw new check("0~200",chi,eng);
		}
	}
}
