package Basic.switchs;

import java.util.Scanner;

public class demo_1 {
	public static void main(String[] args) { // 有 break --> 結束輸出/跳出判斷
		Scanner sc =new Scanner(System.in);
		System.out.print("請輸入等第：");
		String grade = sc.next();
		switch (grade) { // switch 比對值只能是 char ,byte, short, int ,String
		case "A":
			System.out.println("優秀");
			break;//可選
		case "B":
			System.out.println("良好");
			break;//可選
		case "C":
			System.out.println("及格");
			break;//可選
		case "D":
			System.out.println("待加強");
			break;//可選
		case "E":
			System.out.println("未知");
			break;//可選
		default: //可選 --> 以上匹配無任何成功時，輸出 default
			break;//可選
		}
	}
}
