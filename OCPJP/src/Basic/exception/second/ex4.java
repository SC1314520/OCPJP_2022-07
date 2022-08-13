package Basic.exception.second;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
	 * 	throws：異常處理的第一種方式，交給別人處理。 -->交給JVM處理，中斷處理。
	 * 	格式：例如： public void method(int x) throws AAAException...{
	 * 		
	 * 		throw new AAAException("xxxxxx");
	 * 
	 * 	}
	 */

public class ex4 {
	public static void main(String[] args) throws IOException { // 這裡也要撰寫 throws
		readFile("c:///a.txt");
	}
	public static void readFile(String fileName) throws IOException {
		if(!fileName.equals("c:///b.txt")) {
			throw new FileNotFoundException("路徑錯誤！"); // FileNotFoundException 是 IOException 子類別，所以直接宣告父類別即可
		}
		
		if(!fileName.endsWith(".txt")) {
			throw new IOException("文件格式錯誤！");
		}
		System.out.println("文件路徑正確！");
	}
}
