package solve;


// ch3 ex2 
public class change_type{
	public static void main(String[] args) {
		// 有繼承關係
		int x=10;
		Number y=(Number)x;   // 由下轉上 （可）
		int z =(int)y; // 由上轉下 （可）
		
		
		int one=10;
		Number two=20;
		
		two=one; // 父＝子 （可）
		//one=two;  子＝父 （不可）
		
		// 但向上轉型安全，向下轉型不安全。
		
		
		
		int num =(int)10.5;
		System.out.println(num); // 10
		
		
	}
}
