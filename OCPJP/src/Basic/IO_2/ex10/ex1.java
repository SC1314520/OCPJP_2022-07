package Basic.IO_2.ex10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 複製
public class ex1 {
	public static void main(String[] args) throws IOException{
		long s =System.currentTimeMillis();
		FileInputStream fis =new FileInputStream("/Users/blc0000421gmail.com/Desktop/io/NC.JPG");
		FileOutputStream fos =new FileOutputStream("/Users/blc0000421gmail.com/Desktop/io/ex2/NC.JPG");
	/*	
		int len=0;
		while((len=fis.read())!=-1) {
			fos.write(len);
		}
	*/
		
		byte[] bytes =new byte[1024];
		
		int len=0;
		while((len=fis.read(bytes))!=-1) { // 陣列會緩衝並且持續覆蓋，不會超出陣列範圍。
			fos.write(bytes,0,len);
		}
		
		fos.close();
		fis.close();
		
		long e =System.currentTimeMillis();
		
		System.out.println(e-s+" ms");
	}
}
