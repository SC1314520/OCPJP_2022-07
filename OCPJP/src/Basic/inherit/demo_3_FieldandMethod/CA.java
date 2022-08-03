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
	
	/*
	public void abc(int aaa) <-- override 必須與父類別型態相同 int 而非 void
	{
		當名稱一樣，括號也一樣時，會強制要求遵守 override 規則，將類型也須設定稱一樣 ,否則會編譯失敗
	}
	*/
	public int abc(int aaa) {
		return 0;
	}
	/*
	 * 如果父類別有設定封裝權限，子類別的權限需 >= 父類別
	 * Public > protected > (default) > private
	 */
}
