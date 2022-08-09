package Basic.inherit.ex.demo4_overload;

public class test {
	public static void main(String[] args) {
		SumTest.doSum(10, 20); //int sum is 30
		SumTest.doSum(10.0, 20.0); // double sum is 30.0
		
		// 若將方法中的 doSum(int x, int y) 拿掉  --> int 變數會去對應 float 變數方法!!
		// SumTest.doSum(10, 20); //float sum is 30
	}
}
