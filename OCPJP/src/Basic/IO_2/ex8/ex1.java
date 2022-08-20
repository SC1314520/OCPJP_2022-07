package Basic.IO_2.ex8;


import java.io.FileOutputStream;
import java.io.IOException;

public class ex1 {
	public static void main(String[] args) throws IOException {
		// FileOutputStream 會創建一個空的文件！！
		FileOutputStream fos =new FileOutputStream("/Users/blc0000421gmail.com/Desktop/io/c.txt");
		fos.write(97); // a      // byte --> ASCII
		fos.close();
		
	}
}
