package Basic.IO_2.ex12;

import java.io.FileWriter;
import java.io.IOException;

/*
 *   java.io.Reader : 字符輸出流，是字符輸出流的最頂層父類別，定義了一些共性的成員方法 ， 是一個「抽象類別」
 *   FileReader extends OutputStreamReader extends Reader
 *   
 *   構造方法的作用（注意）： 會創建文件！！ 
 *   
 *   步驟：
 *   	1. 創建 FileWriter
 *   	2. 使用 write 寫入到內存緩衝區 （字符轉字節）
 *   	3. 使用 flush 將內存數據刷新到文件中
 *   	4. 釋放資源
 */
public class ex1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw =new FileWriter("/Users/blc0000421gmail.com/Desktop/io/f.txt");
		fw.write(97);
		
		fw.flush(); // 字符轉字節。
		fw.close();
	}
}
