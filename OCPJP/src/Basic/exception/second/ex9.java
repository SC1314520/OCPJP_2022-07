package Basic.exception.second;

public class ex9 { 
	public static void main(String[] args) {
		
		
	}
	public static int getA() {
		int a=10;
		try {
			return a;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			// 一定會執行，所以不建議在此撰寫 return
			//a=100;
			//return a;
		}
		return 0;
	}
}
