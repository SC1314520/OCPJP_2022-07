package Basic.exception.second;

import java.io.IOException;

public class ex6 { // Throwable
public static void main(String[] args) { 
		
		try {
			
			readFile("c:///a.tx");
			
		} catch (IOException e) {
			
			System.out.println(e.getMessage()); // 格式錯誤
			System.out.println(e.toString()); // java.io.IOException: 格式錯誤
			System.out.println(e); // java.io.IOException: 格式錯誤
			e.printStackTrace();
			/*
			  java.io.IOException: 格式錯誤
					at Basic.exception.second.ex6.readFile(ex6.java:27)
					at Basic.exception.second.ex6.main(ex6.java:10)
			 */
		}
		
	
	
	}
	public static void readFile(String fileName) throws IOException {
		
		if(!fileName.endsWith(".txt")) {

			throw new IOException("格式錯誤");  
		}
		System.out.println("文件路徑正確！");
	}
}
