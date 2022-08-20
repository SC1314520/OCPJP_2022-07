package Basic.IO_2.ex14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 *  BufferedWriter extends Writer !!!!!
 *  BufferedWriter : 字符緩衝輸出流
 * 
 */
public class ex1 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw =new BufferedWriter(new FileWriter("/Users/blc0000421gmail.com/Desktop/io/h.txt"));
		for(int i=0;i<=10;i++) {
			bw.write("夜貓");
			//bw.write("\r");
			bw.newLine();// 換行
		}
		
		bw.flush(); // 可省略
		bw.close();
	
	}
}
