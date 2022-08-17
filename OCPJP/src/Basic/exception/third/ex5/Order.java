package Basic.exception.third.ex5;

public class Order {
	private String name;
	private int RAM;
	private int Lcd;
	
	

	public Order(String name, int RAM, int Lcd) throws Exception {
		if(RAM>=0 && Lcd>=0) {
			this.name = name;
			this.RAM=RAM;
			this.Lcd=Lcd;
		}else {
			throw new Exception();
		}
	}

	public void show() {
		System.out.println(name+" "+RAM+" "+Lcd);
	}

	public void setRAM(int rAM) throws check{
		if(rAM>=0) {
			RAM = rAM;
		}
		else {
			throw new check("修改 RAM 須 >=0");
		}
	}

	public void setLcd(int lcd) throws Exception{
		if(lcd>=0) {
			Lcd = lcd;
		}else {
			throw new Exception();
		}
		
	}
	
}
class check extends Exception{
	
	public check(String errMsg) {
		System.out.println(errMsg);
	}
}
