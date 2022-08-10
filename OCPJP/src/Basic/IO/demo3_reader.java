package Basic.IO;

import java.io.FileReader;
import java.io.IOException;


public class demo3_reader {
	public static void main(String[] args) throws IOException {
		FileReader fr =new FileReader("/Users/blc0000421gmail.com/Desktop/io/b.txt");
		System.out.println((char)fr.read()); // read() 一次只讀一個字，讀出來的會是 ASCII 碼 --> 要轉成 char
		int i;
		while((i=fr.read())!=-1) {  // 若資料為空值，則輸出 -1
			System.out.print((char)i);
		}
		
	}
}
