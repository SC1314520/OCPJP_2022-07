package Basic.exception;

import java.io.File;
import java.io.IOException;

public class demo2 { // 非 runtime 系列 --> 必須加入 try-catch 或 exception --> 否則編譯失敗!!
	public static void main(String[] args) /* throws IOException */{
		try {
			File f1 =new File("c:/abc.txt");
			f1.createNewFile();
			System.out.println("新增成功!");
		} catch (IOException e) {
			System.out.println("權限不足，無法新增檔案!");
		}
		
	}
}
