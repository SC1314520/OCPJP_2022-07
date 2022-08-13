package Basic.exception.second.ex11;

import java.util.Scanner;

public class demo2 {
	static String[] usernames = {"aaa","bbb","ccc","ddd","eee"};
	public static void main(String[] args) throws RegisterException2 { // 要聲明拋出例外
		Scanner sc =new Scanner(System.in);
		System.out.print("請輸入您要註冊的用戶名：");
		String username =sc.next();
		checkUsername(username);
	}
	
	public static void checkUsername(String username) throws RegisterException2 { // 要聲明拋出例外
		for(String name: usernames) {
			if(name.equals(username)) {
				
					throw new RegisterException2("該用戶名已經被註冊"); // 運行期異常 --> 無需處理JVM中斷處理！！
				
			}
		}
		System.out.println("恭喜您註冊成功");
	}
}
