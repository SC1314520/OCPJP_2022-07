package Basic.exception.second;

import java.io.IOException;

public class ex7 { // finally -->無論是否出現異常，都會執行。 --> 必須和try一起使用（不可單獨使用）-->一般用於資源示範。
	public static void main(String[] args) {
		try {
			readFile("c:///a.tx");
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("資源釋放！");
		}
	}
	
	public static void readFile(String fileName) throws IOException {
		
		if(!fileName.endsWith(".txt")) {

			throw new IOException("格式錯誤");  
		}
		System.out.println("文件路徑正確！");
	}
}
