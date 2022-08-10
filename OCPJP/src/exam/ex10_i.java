package exam;

interface Long{
	Number length();
}

public class ex10_i {
	public class Trunk implements Long{
		public Number length(){ return 6;} //k1
	}
	
	public class MyTrunk extends Trunk{		//k2
		public Integer length(){ return 9;} //k3 --> 同名強制 override，但因為 Number（父） 與 Integer（子） 具有父子關係，所以可以這樣寫！！ 
	}
	public static void charge(){
		//System.out.print(new MyTrunk().length());  --> 此行錯誤！！ 因為 static 方法中，只能包含 static --> MyTrunk 不屬於 static 方法。
	}
	public static void main(String[] args) {
		//new ex10_i().charge();	//k4  --> 因為受到 charge() 錯誤影響，所以此行錯誤！！  btw,此行程式碼無誤!!
	}
}

/*
Which statement about the Elephant program is correct?

package stampede;
interface Long{
	Number length();
}

public class Elephant{
	public class Trunk implements Long{
		public Number length(){ return 6;} //k1
	}
	
	public class MyTrunk extends Trunk{		//k2
		public Integer length(){ return 9;} //k3
	}
	public static void charge(){
		System.out.print(new MyTrunk().length());
	}
	
	public static void main(String[] cute){
		new Elephant().charge();			//k4
	}
	
}

A. It compiles nad prints 6.
B. The code does not compile because of line k1.
C. The code does not compile becaues of line k2.
D. The code does not compile becaues of line k3.
E. The code does not compile becaues of line k4.  // 不是 k4 錯，而是 charge()方法錯誤，故不可選 D
F. None of the above





ans:F
*/
