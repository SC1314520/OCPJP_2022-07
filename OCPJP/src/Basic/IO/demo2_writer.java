package Basic.IO;


import java.io.FileWriter;
import java.io.IOException;

public class demo2_writer {
	public static void main(String[] args) throws IOException {
		
		//新增文件-2
		FileWriter fw =new FileWriter("/Users/blc0000421gmail.com/Desktop/io/b.txt");
		
		//寫入資料
		fw.write("abcdefg 我是檔案");
		fw.close(); // 存檔後結束-->資料才會寫入
	}
}
