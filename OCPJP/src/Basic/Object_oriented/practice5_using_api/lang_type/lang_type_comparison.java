package Basic.Object_oriented.practice5_using_api.lang_type;

public class lang_type_comparison {
	// byte , short, int, long, float, double, boolean ,char --> 基礎類型 -->普通變數(值)。
	// Byte , Short, Integer, Long, Float, Double, Boolean, Character --> 物件型別  
	public static void main(String[] args) {
		// Double d =new Double(10.2);  --> boxing -->只有 Java 8 以前可以這樣寫。
		Double d =10.2; // AutoBoxing --> Java 9 以後要這樣寫
		
		
		// 基礎型別
		double d1 =10.2;
		double d2 =10.2;
		System.out.println(d1); // 10.2
		System.out.println(d2); // 10.2
		System.out.println(d1==d2); // true --> 值==值 (O)
		
		// 物件型別
		Double d3 =10.2;
		Double d4 =10.2;
		System.out.println(d3); // 10.2
		System.out.println(d4); // 10.2
		System.out.println(d3==d4); //false --> new -->物件(位址) -->位置==位置 (X)
		System.out.println(d3.equals(d4)); // true 物件類別判定值需用 equals 。
	}
	
}
