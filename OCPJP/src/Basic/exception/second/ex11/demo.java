package Basic.exception.second.ex11;

import java.util.Scanner;

public class demo {
	static String[] usernames = {"aaa","bbb","ccc","ddd","eee"};
	public static void main(String[] args) throws RegisterException { // 要聲明拋出例外
		Scanner sc =new Scanner(System.in);
		System.out.print("請輸入您要註冊的用戶名：");
		String username =sc.next();
		checkUsername(username);
	}
	
	public static void checkUsername(String username) throws RegisterException { // 要聲明拋出例外
		for(String name: usernames) {
			if(name.equals(username)) {
				try {
					throw new RegisterException("該用戶名已經被註冊");
				} catch (Exception e) {
					System.out.println(e.getMessage());
					return; // 結束方法 --> 避免繼續執行此方法
				}
				
			}
		}
		System.out.println("恭喜您註冊成功");
	}
}
