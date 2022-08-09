package Basic.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		
		try {
			
			Scanner sc =new Scanner(System.in);
			System.out.print("請輸入數字:");
			int n =sc.nextInt();
			System.out.println(100/n);
			
			// 前方若有錯誤，則以下皆中斷!!
			int x[] =new int[5];
			x[n]=100;
			
			// 前方若有錯誤，則以下皆中斷!!
			System.out.println(x[n]*2);
			
		} catch (ArithmeticException e) {
			
			System.out.println("分母不可為零!");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("n 必須介於 0~4");
			
		}catch (InputMismatchException e) {
			System.out.println("請輸入整數!");
			
		}catch (RuntimeException e) {  //有父類別 RuntimeException 存在時，請將父類別放在最後，不然會出錯!!
			// TODO: handle exception
		}finally {  // finally:無論前面是否有錯誤，一定會做!!
			
			for(int i=0;i<=10;i++) {
				System.out.println("hello");
			}
			
		}
	
		
	}
}