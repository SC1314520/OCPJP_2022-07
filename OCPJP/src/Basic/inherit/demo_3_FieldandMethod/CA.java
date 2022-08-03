package Basic.inherit.demo_3_FieldandMethod;

public class CA extends Company{
	private int Lcd;
	public CA(){
		super();
	}
	public CA(String name,int Lcd) {
		super(name);
		this.Lcd=Lcd;
	}
	public CA(String name,String address,int Lcd) {
		super(name,address);
		this.Lcd=Lcd;
	}
	public void change(int Lcd) { // overload --> 與父類別方法同名。
		this.Lcd=Lcd;
	}
	
	//override --> 命名全部相同，只是改內部程式碼。
	public void skill(int n) {
		if(n>=0) {
			System.out.println("n= "+n);
		}
		else {
			System.out.println("n needs to be positive number !");
		}
	}
	
}
