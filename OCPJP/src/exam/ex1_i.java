package exam;

import java.util.Comparator;

public class ex1_i {
	public static void main(String[] args) {
		
		//compare(T o1, T o2)   --> Compares its two arguments for order.
		// 前後類型須一致，要嘛就是都不要宣告。
		Comparator<String> c1=(j,k)->0;
		Comparator<String> c2=(String j,String k)->0;
		//Comparator<String> c3=(var j,String k)->0;
		//Comparator<String> c4=(var j,k)->0;
		Comparator<String> c5=(var j,var k)->0;
	}
}
