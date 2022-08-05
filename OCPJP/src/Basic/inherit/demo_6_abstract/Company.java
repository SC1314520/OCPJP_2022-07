package Basic.inherit.demo_6_abstract;

// 抽象類別無法產生實體(即無法 new Company())，僅供繼承使使用。
abstract class Company {
	private String name;
	public Company(String name) {
		this.name=name;
	}
	public String show() {
		return "name: "+name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// 抽象方法: 有名字，但沒有內容 --> 繼承的子類別必須實作!! 否則子類別亦須轉換為抽象 class
	abstract void setLcd(int lcd);
}
