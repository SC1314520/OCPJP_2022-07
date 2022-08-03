package Basic.inherit.demo_3;

public class CA extends Company{
	int Lcd;	
	public CA(String name,int Lcd) {
		super(name);
		this.Lcd=Lcd;
	}
	public CA(String name,String address,int Lcd) {
		super(name,address);
		this.Lcd=Lcd;
	}
	
}
