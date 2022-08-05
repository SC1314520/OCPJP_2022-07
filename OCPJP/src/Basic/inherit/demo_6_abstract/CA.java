package Basic.inherit.demo_6_abstract;

public class CA extends Company{
	private int Lcd;
	public CA(String name,int Lcd) {
		super(name);
		this.Lcd=Lcd;
	}
	public String show() {
		return super.show()+" Lcd: "+Lcd;
	}
	public void setLcd(int lcd) {
		Lcd = lcd;
	}
	
}
