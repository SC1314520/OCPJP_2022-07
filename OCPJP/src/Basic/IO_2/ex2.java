package Basic.IO_2;

import java.io.File;

public class ex2 {
	public static void main(String[] args) {
		//show1();
		//show2("/Users/blc0000421gmail.com/Desktop/io/","a.txt");
		show3();
}
	
	public static void show1() {
		File file =new File("/Users/blc0000421gmail.com/Desktop/io/a.txt");
		System.out.println(file); // /Users/blc0000421gmail.com/Desktop/io/a.txt  --> 方法內部以覆寫 toString()
	}
	
	public static void show2(String parent,String child) {
		File file =new File(parent,child); // --> 拆成兩部分，使用其來靈活！！
		System.out.println(file); // /Users/blc0000421gmail.com/Desktop/io/a.txt
	}
	
	public static void show3() {
		File parent =new File("/Users/blc0000421gmail.com/Desktop/io/");
		File file =new File(parent,"a.txt");
		System.out.println(file); // /Users/blc0000421gmail.com/Desktop/io/a.txt
	}
}
