package Basic.IO_2.ex12;

import java.io.FileWriter;
import java.io.IOException;

//續寫和換行
public class ex4 {
	public static void main(String[] args) throws IOException {
		FileWriter fw =new FileWriter("/Users/blc0000421gmail.com/Desktop/io/f.txt",true);
		for(int i=0;i<=10;i++) {
			fw.write("安安～");
			fw.write("\r");
		}
		
		
		fw.close();
	}
}
