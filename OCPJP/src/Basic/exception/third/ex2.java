package Basic.exception.third;

import java.util.Scanner;
/*
 *  RuntimeException:
 *  	1.Unchecked
 * 		2.不捕捉也可
 * 	非 RuntimeException：
 * 		1.Checked
 * 		2.必須捕捉！！
 */
public class ex2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int[] x =new int[10];
		
		// x[11]=100; // --> RuntimeException --> java.lang.ArrayIndexOutOfBoundsException     
		System.out.print("請輸入索引碼：");
		int n =sc.nextInt(); 
		System.out.println(x[n]);
		// 若索引碼超出陣列範圍，則會拋出例外，以下程式碼將不會執行。
		
		
		for(int i=0;i<10;i++) {
			System.out.println("success");
		}
	}
}
