package Basic.inherit.demo_6_abstract;

// 若繼承的子類別無實作抽象方法，則也需轉換為抽像 class ...(1)
abstract public class CB extends Company {
	private int RAM;
	public CB(String name,int RAM) {
		super(name);
		this.RAM=RAM;
	}
	public String show() {
		return super.show()+" RAM: "+RAM;
	}
//	public void setLcd(int lcd) { // 直接實作出來 ...(2) 
//		
//	}
}
