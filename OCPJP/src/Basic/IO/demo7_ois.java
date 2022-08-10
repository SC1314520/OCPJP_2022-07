package Basic.IO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Basic.IO.demo6_oos.student;

public class demo7_ois {
	public static void main(String[] args)throws IOException, ClassNotFoundException {
		FileInputStream fis =new FileInputStream("/Users/blc0000421gmail.com/Desktop/io/student.txt");
		ObjectInputStream ois =new ObjectInputStream(fis);
		
		// System.out.println(ois.readObject()); 讀取物件 hashcode 位置
		// System.out.println(((student)ois.readObject()).getName());
		
		while(true) {
			try {
				((student)ois.readObject()).show();  //<-- 捕捉完畢後，仍在執行 while ...(1)
			}catch (EOFException e) {
				System.out.println("ending");
				break;  // 所以要撰寫 break ...(1)
			}
			
		}
	}
	
}
