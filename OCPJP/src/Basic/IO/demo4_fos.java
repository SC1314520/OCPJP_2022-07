package Basic.IO;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;



public class demo4_fos {
	public static void main(String[] args) throws IOException {
		
		//新增文件-3
		FileOutputStream fos=new FileOutputStream("/Users/blc0000421gmail.com/Desktop/io/c.txt");
		
		//寫入資料-1
		//fos.write(65); --> write(ASCII);
		
		
		// 串接
		OutputStreamWriter osw =new OutputStreamWriter(fos);
		//寫入資料-2
		//osw.write("abcde 我是osw");
		//osw.close();
		
		//寫入資料-3 --> BufferedWrite(Writer x);  --> 放 writer 物件系列 
		BufferedWriter bw=new BufferedWriter(osw);
		bw.write("bwbw 我是bw");
		bw.close();
		
		
		
		//寫入資料-4 (連續注入寫法）
		BufferedWriter bw2 =new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/Users/blc0000421gmail.com/Desktop/io/d.txt")));
		bw2.write("ddddd 我是d");
		bw2.close();
		
	}
}
