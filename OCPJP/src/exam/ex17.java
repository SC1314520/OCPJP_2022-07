package exam;

public class ex17 {
	public static void main(String[] args)
	{
		Price p1=new Price("1.99");
		Price p2=new Price(2.99);
		Price p3=new Price();
		System.out.println(p1.getValue()+","+p2.getValue()+","+p3.getValue());
	}
}
class Price{
	private final double value;
	public Price(){
		value=10.1;  // final若一開始沒有賦予初始值，則須在建構子中加入。
	}
	public Price(String value){
		this(Double.parseDouble(value)); // 轉給 public Price(double value）建構子。
	}
	public Price(double value){
		this.value=value;
	}
	
	public double getValue(){ return value;}
	
}
/*
 What is the result?

A) 1.99,2.99,0.0
B) 1.99,2.99
C) The compilation fails
D) 1.99,2.99,0




ans:C
*/
