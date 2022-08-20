package Basic.IO_2.ex7;

import java.io.File;

public class ex4 {
	public static void main(String[] args) {
		File file =new File("/Users/blc0000421gmail.com/Desktop/io/ex2");
		getAllFile(file);
	
	}
	public static void getAllFile(File dir) {
		System.out.println(dir);
		File[] files=dir.listFiles();
		for(File f:files) {
			if(f.isDirectory()) {
				getAllFile(f);
			}
			System.out.println(f);
		}
	/*
	    /Users/blc0000421gmail.com/Desktop/io/ex2
		/Users/blc0000421gmail.com/Desktop/io/ex2/.DS_Store
		/Users/blc0000421gmail.com/Desktop/io/ex2/1
		/Users/blc0000421gmail.com/Desktop/io/ex2/1/.DS_Store
		/Users/blc0000421gmail.com/Desktop/io/ex2/1/a.txt
		/Users/blc0000421gmail.com/Desktop/io/ex2/1/2
		/Users/blc0000421gmail.com/Desktop/io/ex2/1/2/.DS_Store
		/Users/blc0000421gmail.com/Desktop/io/ex2/1/2/ex1
		/Users/blc0000421gmail.com/Desktop/io/ex2/1/2/ex1
		/Users/blc0000421gmail.com/Desktop/io/ex2/1/2/b.txt
		/Users/blc0000421gmail.com/Desktop/io/ex2/1/2/3
		/Users/blc0000421gmail.com/Desktop/io/ex2/1/2/3
		/Users/blc0000421gmail.com/Desktop/io/ex2/1/2
		/Users/blc0000421gmail.com/Desktop/io/ex2/1
	 */
	}

}
