package Basic.switchs;

import java.util.Scanner;

public class demo_2 {
	public static void main(String[] args) { // 無 break --> 匹配成功者，以下全數輸出。
		Scanner sc =new Scanner(System.in);
		System.out.print("請輸入等第：");
		String grade = sc.next();
		switch (grade) { // switch 比對值只能是 char ,byte, short, int ,String
		case "A":
			System.out.println("優秀");
		case "B":
			System.out.println("良好");
		case "C":
			System.out.println("及格");
		case "D":
			System.out.println("待加強");
		case "E":
			System.out.println("未知");
		default: //可選 
			System.out.println("我是 Default !");
		}
	}
}
// 假設在等第為 C 的話，case "C" 以下，全數輸出：
/* 輸出結果：
 * 及格
 * 待加強
 * 未知
 * 我是 Default !
 */