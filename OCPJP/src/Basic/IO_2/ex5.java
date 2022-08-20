package Basic.IO_2;

import java.io.File;
import java.io.IOException;

public class ex5 {
	public static void main(String[] args) throws IOException {
		show1();
		show2();
		show3();
		show4();
	}
	
	public static void show1() throws IOException {
		File file =new File("/Users/blc0000421gmail.com/Desktop/io/b.txt");
		System.out.println(file.createNewFile()); 
		/*
		 *  true: 文件不存在，創建文件。
		 *  false: 文件存在，不會創建。
		 */
	}
	
	public static void show2() { // 創建單層文件夾
		File file =new File("/Users/blc0000421gmail.com/Desktop/io/ex1");
		System.out.println(file.mkdir()); 
		/*
		 *  true: 文件夾不存在，創建文件。
		 *  false: 文件夾存在，不會創建。
		 */
	}
	
	public static void show3() { // 創建多層文件夾
		File file =new File("/Users/blc0000421gmail.com/Desktop/io/ex2/1/2/3");
		System.out.println(file.mkdirs()); // 不會拋出異常，但路徑不存在，不會創建文件夾。
	}
	
	public static void show4() {
		File file =new File("/Users/blc0000421gmail.com/Desktop/io/ex2/1/2");
		System.out.println(file.delete());
		// 路徑不存在 --> 返回 false
		// 文件夾中有內容 --> 不會刪除！！！！！！
		// 一但刪除成功，就會完全消失！！！-->直接從磁碟中刪除。
	}
}
