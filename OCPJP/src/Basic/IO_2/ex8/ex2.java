package Basic.IO_2.ex8;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ex2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos =new FileOutputStream(new File("/Users/blc0000421gmail.com/Desktop/io/d.txt"));
		fos.write(49); // 1
		fos.write(48); // 0
		fos.write(48); // 0
		
		
		// 一次寫多個字節
		/*
		 *  第一個字節若為正數 --> ASCII
		 *  第一個字節若為負數，則會與第二個字節形成中文 --> 系統默認碼表
		 */
    	byte[] bytes = {65,66,67,68,69};
		fos.write(bytes);
		
    	// write(byte[] b , int off ,int length)
    	fos.write(bytes,1,2); // BC
		
    	FileOutputStream fos2 =new FileOutputStream(new File("/Users/blc0000421gmail.com/Desktop/io/e.txt"));
		byte[] byte2 ="你好".getBytes();
		System.out.println(Arrays.toString(byte2));
		fos2.write(byte2);
		
		// 釋放資源
		fos.close();  // 後者會覆蓋前者
		fos2.close(); // 後者會覆蓋前者
	}
}
