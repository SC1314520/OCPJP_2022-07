package Basic.exception.demo5;

class student3{ // 繼承 --> 父類別有 exception 子類別無，可執行，但相反不可!!
	public void show(int x) throws checkA,checkB{  //除非在父類別新增 checkB ---- (2) 
		if(x>=0){
			System.out.println("student3");
		}
		else if (x<0 && x>=-10){
			throw new checkA();
		}
		else {
			throw new checkB();
		}
	}
}

class studenta extends student3{  
	
	public void show(int x) {
		System.out.println("studenta");
	}
}

class studentb extends student3 {
	public void show(int x) throws checkA_1 {  // checkA_1 是 checkA 的子類別。    // 但 class父類別寫的是 checkA_1 ，則這裡不可以寫 checkA ，只能寫 checkA_1 及其子類別。
		if(x>=0){
			System.out.println("studentb");
		}
		else {
			throw new checkA_1();
		}
	}
}

class studentc extends student3{
	public void show(int x) throws checkB{   // --> class之間有繼承關係，則exception的繼承順序也要一樣!!   ---- (2) 
		if(x>=0){
			System.out.println("studentc");
		}
		else {
			throw new checkB();
		}
	}
}


public class ex5 {
	public static void main(String[] args) throws checkA,checkB {
		studenta s =new studenta();
		s.show(10); // studenta
		
		studentb s2 =new studentb();
		s2.show(20); // studentb
		
		studentc s3 =new studentc();
		s3.show(20); // studentc
	}
}



