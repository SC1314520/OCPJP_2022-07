package Basic.inherit.ex.demo4_overload;

public class SumTest {
	public static void doSum(Integer x, Integer y) {
		System.out.println("Integer sum is "+(x+y));
	}
	public static void doSum(double x, double y) {
		System.out.println("double sum is "+(x+y));
	}
	public static void doSum(float x, float y) {
		System.out.println("float sum is "+(x+y));
	}
	public static void doSum(int x, int y) {
		System.out.println("int sum is "+(x+y));
	}
}
