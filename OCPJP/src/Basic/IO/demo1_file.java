package Basic.IO;

import java.io.File;
import java.io.IOException;

public class demo1_file {
	public static void main(String[] args) throws IOException {
		// 新增文件
				File f =new File("/Users/blc0000421gmail.com/Desktop/io/a.txt");
				f.createNewFile();
				
				//新增資料夾
				File f2 =new File("/Users/blc0000421gmail.com/Desktop/io/first");
				f2.mkdir();
				
				//新增多重資料夾
				File f3 =new File("/Users/blc0000421gmail.com/Desktop/io/second/third/fourth");
				f3.mkdirs();
	}
}
