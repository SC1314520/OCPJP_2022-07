package Basic.IO_2.ex16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 *  ObjectInputStream extends InputStream
 * 	ObjectInputStream:對象的反序列化流
 * 
 *  
 */
public class ex2 {
	public static void main(String[] args) throws  IOException, ClassNotFoundException {
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("/Users/blc0000421gmail.com/Desktop/io/j.txt"));
		System.out.println(ois.readObject());
		
		//Object o=ois.readObject(); --> EOFException
		//Person p =(Person)ois.readObject(); // 可轉型
		
		ois.close();
	
	}
}
