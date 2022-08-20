package Basic.IO_2.ex7;

// 求 n 階乘
public class ex3 {
	public static void main(String[] args) {
		System.out.println(sum(5));
	}
	
	public static int sum(int n) {
		if(n==1)
			return 1;
		else
			return n*sum(n-1);
	}
}
