package Basic.inherit.ex;

public class ex_method {
	String type ="Canine";
	int maxSpeed=60;
	
	ex_method(){
		
	}
	ex_method(String type,int maxSpeed){
		this.type=type;
		this.maxSpeed=maxSpeed;
	}
}
class ex extends ex_method{
	String bounds;
	ex(String bounds){
		super(); // super() 一定要放在第一行！！  // 此外 this() 也要放在第一行 --> 所以 super(),this() 不可以出現在同一個{}中。
		this.bounds=bounds;
	}
	ex(String type,int maxSpeed, String bounds){
		super(type,maxSpeed);
		this.bounds=bounds;
	}
}
