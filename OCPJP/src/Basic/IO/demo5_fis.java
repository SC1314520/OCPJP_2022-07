package Basic.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo5_fis {
	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("/Users/blc0000421gmail.com/Desktop/io/c.txt");
		/* 讀取資料-1 (無法處理中文）
		System.out.println((char)fis.read());
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		*/
		
		// 讀取資料-2 (可處理中文）
		
		InputStreamReader isr =new InputStreamReader(fis);

		int i;
		while((i=isr.read())!=-1) {
			System.out.print((char)i);
		}

		// 讀取資料-3
		BufferedReader br =new BufferedReader(isr);
		int j;
		while((j=br.read())!=-1) {
			System.out.print((char)j);
		}
		
		// 讀取資料-4
		BufferedReader br2 =new BufferedReader(new InputStreamReader(new FileInputStream("/Users/blc0000421gmail.com/Desktop/io/c.txt")));
		int k;
		while((k=br2.read())!=-1) {
			System.out.print((char)k);
		}
	}
}
