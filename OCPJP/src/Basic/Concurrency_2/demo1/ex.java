package Basic.Concurrency_2.demo1;

public class ex { // Thread
	public static void main(String[] args) throws InterruptedException {
		student[] s= {
				new student("abc"),
				new student("def"),
				new student("ghi")
		};
		
		for(int i=0;i<s.length;i++) {
			//s[i].run(); --> 單工
			s[i].start(); // --> 多工
		}
		for(int i=0;i<=5;i++) {
			Thread.sleep(200);
			System.out.println("hello");
		}
	}
}
