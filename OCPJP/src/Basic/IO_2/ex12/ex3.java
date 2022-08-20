package Basic.IO_2.ex12;

import java.io.FileWriter;
import java.io.IOException;

// 其他寫入法
public class ex3 {
	public static void main(String[] args) throws IOException {
		FileWriter fw =new FileWriter("/Users/blc0000421gmail.com/Desktop/io/f.txt");
		// void write(char[] cbuf) 
		char[] cs= {'a','b','c','d','e'};
		fw.write(cs);
		
		
		
		// void write(char[] cbuf,int off, int len)
		fw.write(cs,1,3); // bcd
		
		
		
		// void write(String str)
		fw.write("你好！！");
		
		
		// void write(String str ,int off, int len)
		fw.write("我很好！",1,2); //很好
		
		
		fw.close();
	}
}
