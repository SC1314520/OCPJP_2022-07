package Basic.IO_2.ex7;

import java.io.File;

public class ex5 {
	public static void main(String[] args) {
		File file =new File("/Users/blc0000421gmail.com/Desktop/io/ex2");
		getAllFile(file);
	
	}
	// 只要 .txt 結尾的文件
	public static void getAllFile(File dir) {
		//System.out.println(dir);
		File[] files=dir.listFiles();
		for(File f:files) {
			if(f.isDirectory()) {
				getAllFile(f);
			}
			else {
				String name=f.getName();
				if(name.endsWith(".txt")) {
					System.out.println(f);
				}
			}
			/*
			 	/Users/blc0000421gmail.com/Desktop/io/ex2/1/a.txt
			 	/Users/blc0000421gmail.com/Desktop/io/ex2/1/2/b.txt
			 */
			
		}
	
	}

}
