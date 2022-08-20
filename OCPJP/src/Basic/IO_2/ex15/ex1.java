package Basic.IO_2.ex15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 *  OutputStreamWriter extends Writer
 *  OutputStreamWriter ：是字符轉成字節的橋樑。
 *  
 *  OutputStreamWriter(OutputStream out)
 *  OutputStreamWriter(OutputStream out,String charsetName)
 *    
 *  String charsetName: 指定編碼表名稱。  默認為 utf-8
 */
public class ex1 {
	public static void main(String[] args) throws IOException{
		write_utf_8();
	}
	
	private static void write_utf_8() throws IOException{
		OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream("/Users/blc0000421gmail.com/Desktop/io/i.txt"),"utf-8");
		osw.write("你好");
		osw.flush();
		osw.close();
	}
}
