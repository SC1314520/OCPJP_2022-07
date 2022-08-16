package Basic.exception.third;

import java.util.InputMismatchException;
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
		for(int i=0;i<x.length;i++) {
			x[i]=i;
		}
		try {
			// x[11]=100; // --> RuntimeException --> java.lang.ArrayIndexOutOfBoundsException     
			System.out.print("請輸入索引碼：");
			int n =sc.nextInt(); 
			// 若索引碼超出陣列範圍，則會拋出例外，以下程式碼將不會執行。
			
			System.out.print("請輸入分母：");
			double m =sc.nextDouble();
			System.out.println("x["+n+"]/"+m+" = "+(x[n]/m));
			
			
			System.out.println("success");
			
		} catch (ArrayIndexOutOfBoundsException e) {  // ArrayIndexOutOfBoundsException e =new ArrayIndexOutOfBoundsException();
			System.out.println("index 須介於 0~9 之間");
			
			e.printStackTrace(); // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10 at Basic.exception.third.ex2.main(ex2.java:25)
			System.out.println(e); // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
			System.out.println(e.toString()); // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
			System.out.println(e.getMessage()); // Index 10 out of bounds for length 10
			
		} catch(InputMismatchException e) {
			System.out.println("index 須為整數！！");
		} catch (ArithmeticException e) {
			System.out.println("分母不得為零");
		}
		
	}
}
