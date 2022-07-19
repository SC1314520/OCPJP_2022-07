package Basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class for_model_1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("請輸入次數:");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++) {
			// if(i==101) break; // 1~100
			//if(i==101) continue; // 只有 101 不執行，之後繼續執行完畢。
			if(i>=40 && i<=80) continue; // 40~80 不執行
			System.out.println("i="+i);
		}
	}
}
