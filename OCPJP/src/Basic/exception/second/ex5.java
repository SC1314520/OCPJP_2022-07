package Basic.exception.second;


import java.io.IOException;

public class ex5 { // try-catch
	public static void main(String[] args) { // 這裡也要撰寫 throws
		
		try {
			
			readFile("c:///a.tx");
			
		} catch (IOException e) {
			
			System.out.println("catch - 傳遞文件的格式錯誤");
			
		}
		
	
	
	}
	public static void readFile(String fileName) throws IOException {
		
		if(!fileName.endsWith(".txt")) {
			//throw new IOException("文件格式錯誤！");//此行的警告文字不會執行。-->除非呼叫 e.getMessage();-->參考 ex6
			throw new IOException();  // 直接這樣寫就好。
		}
		System.out.println("文件路徑正確！");
	}
}
