package Basic.IO_2;

import java.io.File;

public class ex4 {
	public static void main(String[] args) {
		show1();
		show2();
		show3();
	}
	
	public static void show1() {
		File f1 =new File("/Users/blc0000421gmail.com/Desktop/io");
		System.out.println(f1.exists()); // true  --> 判斷路徑是否存在。
	}
	
	public static void show2() {
		File f1 =new File("/Users/blc0000421gmail.com/Desktop/io");
		if(f1.exists())
		System.out.println(f1.isDirectory()); // true --> 判斷是否為文件夾。
	}
	
	public static void show3() {
		File f1 =new File("/Users/blc0000421gmail.com/Desktop/io");
		if(f1.exists())
		System.out.println(f1.isFile()); // false --> 判斷是否為文件。
	}
}
