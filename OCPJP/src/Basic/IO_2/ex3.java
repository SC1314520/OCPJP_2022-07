package Basic.IO_2;

import java.io.File;

public class ex3 {
	public static void main(String[] args) {
		File file =new File("/Users/blc0000421gmail.com/Desktop/io/a.txt");
		String abs = file.getAbsolutePath(); // 回傳絕對路徑
		System.out.println(abs); // /Users/blc0000421gmail.com/Desktop/io/a.txt
		
		
		String rel=file.getPath(); // 建構子方法中傳遞的路徑
		System.out.println(rel); // /Users/blc0000421gmail.com/Desktop/io/a.txt
		
		
		// 以下兩者就是調用 getPath() 方法。
		System.out.println(file); // /Users/blc0000421gmail.com/Desktop/io/a.txt
		System.out.println(file.toString()); // /Users/blc0000421gmail.com/Desktop/io/a.txt
	
	
		String name =file.getName(); // 獲取傳遞路徑的結尾。
		System.out.println(name); // a.txt
		
		
		long length =file.length(); // 獲取文件大小，此外，文件夾是沒有大小的！！
		System.out.println(length); // 20 （byte)
	
	}
}
