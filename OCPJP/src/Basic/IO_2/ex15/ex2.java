package Basic.IO_2.ex15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  InputStreamReader extends Reader
 *  InputStreamReader ：是字節轉成字符的橋樑。
 *  
 *  注意事項：
 *  	構造方法中的編碼名稱要和文件編碼相同。
 */
public class ex2 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr =new InputStreamReader(new FileInputStream("/Users/blc0000421gmail.com/Desktop/io/i.txt"),"utf-8");
		
		int len=0;
		while((len=isr.read())!=-1) {
			System.out.print((char)len);
		}
		
		isr.close();
	
	}
}
