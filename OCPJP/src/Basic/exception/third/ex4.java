package Basic.exception.third;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class ex4 {
	public static void main(String[] args){
		try {
			File f1 =new File("/Users/blc0000421gmail.com/Desktop/io");
			f1.mkdir(); // 新建資料夾
			File f2 =new File("/Users/blc0000421gmail.com/Desktop/io/a.txt");
			f2.createNewFile(); // 新增文件
			BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f2)));
			String s ="abcdefasdwqwwfsfaswc";
			bw.write(s);
			bw.close();
			
			BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(f2)));
			
			char[] cr =new char[s.length()];
			br.read(cr);
			for(char x:cr) {
				System.out.print(x);
			}
			
			
		} catch (IOException e) {
			System.out.println("無新增權限");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
