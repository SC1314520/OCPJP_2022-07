package Basic.IO_2;

import java.io.File;

class ex1 {
	public static void main(String[] args) {
		
		String pathSeparator =File.pathSeparator;
		System.out.println(pathSeparator); // windows 是;   unix 是 :   --> 路徑分隔符號
		
		String separator =File.separator; // 文件名稱分隔符號
		System.out.println(separator); // windows 是 \   unix 是 /
	
	}
}
