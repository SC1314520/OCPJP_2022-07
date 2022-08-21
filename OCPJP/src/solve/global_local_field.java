package solve;

// ch3 ex5
public class global_local_field {
	// global
	static  int  myint=666;
	
	public static void main(String[] args) {
		// local
		// int myint=myint; --> 這要給初始值，不然會不知道 myint 是誰。
		myint=999; // -->全域變數
		int myint =10; // --> 區域變數
		System.out.println(myint); // 10 --> 區域變數
		System.out.println(global_local_field.myint); // 999 -->全域變數
	}
}

