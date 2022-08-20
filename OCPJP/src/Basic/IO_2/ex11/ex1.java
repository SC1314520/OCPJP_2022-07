package Basic.IO_2.ex11;

import java.io.FileReader;
import java.io.IOException;



/*
 *    java.io.Reader : 字符輸入流，是字符輸入流的最頂層父類別，定義了一些共性的成員方法 ， 是一個「抽象類別」
 *    FileReader extends InputStreamReader extends Reader
 *    
 *    "/Users/blc0000421gmail.com/Desktop/io/e.txt"
 */
// 字符輸入流 --> 可以解決中文問題。
public class ex1 {
	public static void main(String[] args) throws IOException {
		FileReader fr =new FileReader("/Users/blc0000421gmail.com/Desktop/io/e.txt");
		
		int len=0;
		while((len=fr.read())!=-1) {
			System.out.print((char)len);
		}
		fr.close();
	
		
		FileReader fr2 =new FileReader("/Users/blc0000421gmail.com/Desktop/io/e.txt");
		char[] cs =new char[1024];
		int len2=0;
		while((len2=fr2.read(cs))!=-1) {
			System.out.println(new String(cs,0,len2));
		}
		
	}
}
