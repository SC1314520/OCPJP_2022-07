package exam;

public class ex13_ii {
	enum Machine{
		AUTO("Truck"),MEDICAL("Scanner");
		private String type;
		private Machine(String type){ // enum 的建構子必須是 private
			this.type=type;
		}
		private void setType(String type){
			this.type=type;			//line 1
		}
		private String getType()
		{
			return type;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine.AUTO.setType("Sedan");		//line 2
		for(Machine p:Machine.values())
		{
			System.out.println(p+": "+p.getType());	//line 3
		}	
		
	}
}

// 輸出結果： AUTO: Sedan   MEDICAL: Scanner
