package Basic.IO_2.ex13;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *    BufferedOutputStream extends OutputStream
 * 	  BufferedOutputStream : 字節緩衝輸出流
 * 
 * 
 * 	  BufferedOutputStream(OutputStream out)
 * 	  BufferedOutputStream(OutputStream out,int size)  --> size : 指定緩衝流內部緩衝區大小，不指定則為默認大小。
 */
public class ex1 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos =new FileOutputStream("/Users/blc0000421gmail.com/Desktop/io/g.txt");
		BufferedOutputStream bos =new BufferedOutputStream(fos);
		
		bos.write("寫入內部緩衝區".getBytes());
		
		bos.flush(); // 可以省略不寫～～
		
		bos.close(); // 這會先調用 flush()，之後才釋放資源。
	}
}
