package Basic.IO_2.ex8;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

//續寫 FileOutputStream (String name, boolean append)  or (File file,boolean append)
/*
 *  true: 創建對象不會覆蓋原文件，繼續在文件末尾追加寫數據。
 * 	false:創建一個新文件，覆蓋原文件。
 */

//換行 ：寫換行符號
/*
 *   windows : \r\n
 * 	 linux: \n
 *   mac: \r
 */
public class ex3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos =new FileOutputStream(new File("/Users/blc0000421gmail.com/Desktop/io/e.txt"),false);
		for(int i=0;i<=10;i++) {
			fos.write(" 我很好 ".getBytes());
			fos.write("\r".getBytes());
		}
		
		fos.close();
	}
}
