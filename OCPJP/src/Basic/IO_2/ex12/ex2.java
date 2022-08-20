package Basic.IO_2.ex12;

import java.io.FileWriter;
import java.io.IOException;

/*
 *  flush: 刷新緩衝區	，流對象還可以繼續使用。
 *  close: 則會釋放資源，不可再使用。
 * 
 */
public class ex2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw =new FileWriter("/Users/blc0000421gmail.com/Desktop/io/f.txt");
		fw.write(97);
		fw.flush(); // 可重複使用。
		fw.write(98);
		fw.flush(); // 可重複使用。
		fw.close(); // 釋放資源。
	}
}
