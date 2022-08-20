package Basic.IO_2.ex14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 *  BufferedReader extends Reader
 * 
 */
public class ex2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new FileReader("/Users/blc0000421gmail.com/Desktop/io/h.txt"));
	
		String line;	
		while((line=br.readLine())!=null) { // 回傳值為 null
			
			System.out.println(line);
		}
		
		
		br.close();
	}
}
