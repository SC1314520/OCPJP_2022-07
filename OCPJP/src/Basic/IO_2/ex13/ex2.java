package Basic.IO_2.ex13;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 
 *  BufferedInputStream extends InputStream 
 *  BufferedInputStream: 字節緩衝輸入流
 */
public class ex2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("/Users/blc0000421gmail.com/Desktop/io/d.txt");
		BufferedInputStream bis =new BufferedInputStream(fis);
		
//		int len=0;
//		while((len=bis.read())!=-1) {
//			System.out.print((char)len);
//		}
		
		byte[] bytes =new byte[1024];
		int len2=0;
		while((len2=bis.read(bytes))!=-1) {
			System.out.println(new String(bytes,0,len2));
		}
		
		bis.close();
		
	}
}
