package Basic.IO_2.ex7;

import java.io.File;

public class ex4 {
	public static void main(String[] args) {
		File file =new File("/Users/blc0000421gmail.com/Desktop/io/ex2");
		getAllFile(file);
	
	}
	public static void getAllFile(File dir) {
		File[] files=dir.listFiles();
		for(File f:files) {
			System.out.println(f);
		}
	}
}
