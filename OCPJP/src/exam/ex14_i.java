package exam;

public class ex14_i {
	static int myint=666;
	public static void main(String[] args){
		// int myint=myint; --> 此行錯誤！！ 因為在區域變數中未給予初始值...
		/*
		int myint=10; // 這樣才可以
		myint=myint+1;  
		*/
		// 也可以這樣寫：
		int myint = ex14_i.myint;
	
		System.out.println(myint);
	}
}
