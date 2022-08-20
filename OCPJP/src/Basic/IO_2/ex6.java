package Basic.IO_2;

import java.io.File;

public class ex6 {
	public static void main(String[] args) {
		// 路徑不存在，則會拋出例外！！
		// 路徑若不是文件夾，也會拋出例外！！！！！！
		
		show1();
		show2();
	}
	public static void show1() {
		File file =new File("/Users/blc0000421gmail.com/Desktop/io");
		String[] arr=file.list();
		for(String name:arr) {
			System.out.println(name);
		}
		/*
		.DS_Store
		ex1
		b.txt
		a.txt
		ex2
		 */
	}
	
	public static void show2() {
		File file =new File("/Users/blc0000421gmail.com/Desktop/io");
		File[] listFiles = file.listFiles();
		for(File f :listFiles) {
			System.out.println(f);
		}
		/*
		 /Users/blc0000421gmail.com/Desktop/io/.DS_Store
		 /Users/blc0000421gmail.com/Desktop/io/ex1
	     /Users/blc0000421gmail.com/Desktop/io/b.txt
		 /Users/blc0000421gmail.com/Desktop/io/a.txt
		 /Users/blc0000421gmail.com/Desktop/io/ex2
		 */
	}
}
