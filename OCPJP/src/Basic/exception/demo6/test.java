package Basic.exception.demo6;

import java.util.Scanner;

public class test {
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			cal c =new cal();
			
			int x =sc.nextInt();
			int y =sc.nextInt();
			try {
				
				// assert x>0 && y>0: "需大於 0"; // --> cmd:  java -ea test
				System.out.println(c.sum(x, y));
				
				// stackoverflow
				c.abc1(); 
				
			} catch (Exception e) {
				System.out.println("x 和 y 皆需大於 0");
			}
			
	}
}
