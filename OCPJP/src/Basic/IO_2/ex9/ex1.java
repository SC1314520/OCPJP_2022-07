package Basic.IO_2.ex9;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

public class ex1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream(new File("/Users/blc0000421gmail.com/Desktop/io/d.txt"));
//		System.out.println((char)(fis.read()));  //1 讀取一個字
//		System.out.println((char)(fis.read()));  //0 讀取一個字
//		System.out.println((char)(fis.read()));  //0 讀取一個字
		
		int len=0; // 紀錄讀取數據
		while((len=fis.read())!=-1) { //  -1 表示空
			System.out.print((char)(len)); // 100ABCDEBC
		}
		
		fis.close();
	}
}
