package Basic;

public class primitive {
	public static void main(String[] args) {
		double y=15.6;
		int x = (int)y;
		System.out.println(x); // 15
		
		Double y2 =15.0; // 不可以寫 15 ，一定要寫 15.~
		Float f=15.0f; 
		// Integer x2=Integer.parseInt(y2);
		// Integer x2 =(int)y2;
		
		
		// byte<short<char<int<long<float<double
		
		int i=10;
		double d=20;
		//i=d;  // 不可以 小＝大
		d=i;  // 可以 大＝小（自動轉換）
		
		byte b=10;
		short s =20;
		int it=b+b; // byte,short 會自動升級為 int
		int it2=s+s; // byte,short 會自動升級為 int
		int it3 = b+s;   // byte,short 會自動升級為 int
		System.out.println(it); // 20
		System.out.println(it2); // 40
		System.out.println(it3); // 30
	}
}
