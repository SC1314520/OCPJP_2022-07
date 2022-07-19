package Basic;

import java.util.Scanner;


public class for_model_2 {
	public static void main(String[] args) {
		int i,j;
		Scanner scanner =new Scanner(System.in);
		System.out.print("請輸入列數:");
		int n=scanner.nextInt();
		System.out.print("請輸入行數:");
		int m=scanner.nextInt();
		a: //label 必須寫在所要指定的 for 迴圈前一行
		for(i=1;i<=n;i++) {
			for(j=1;j<=m;j++) {
				if(j==10) break; //break 只會跳出一層(當前)迴圈。
				if(i==10) break a; // break 跳出 label 為 a 的迴圈
				System.out.print(i+"*"+j+"="+i*j +"\t");
			}
			System.out.println();
		}
	}
	
}
