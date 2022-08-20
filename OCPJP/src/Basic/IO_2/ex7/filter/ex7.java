package Basic.IO_2.ex7.filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class ex7 {
	public static void main(String[] args) {
		File file =new File("/Users/blc0000421gmail.com/Desktop/io/ex2");
		getAllFile(file);
	
	}
	// 只要 .txt 結尾的文件
	public static void getAllFile(File dir) {
		//System.out.println(dir);
		/*File[] files=dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".txt");
			}
		});
		*/
		/*File[] files =dir.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
				return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".txt");
			}
		});
		*/
		//File[] files=dir.listFiles((pathname)-> pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".txt"));
		File[] files =dir.listFiles((d,name)->new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".txt"));
		for(File f:files) {
			if(f.isDirectory()) {
				getAllFile(f);
			}
			else {
				
					System.out.println(f);
				
			}
			/*
			 	/Users/blc0000421gmail.com/Desktop/io/ex2/1/a.txt
			 	/Users/blc0000421gmail.com/Desktop/io/ex2/1/2/b.txt
			 */
			
		}
	
	}

}
