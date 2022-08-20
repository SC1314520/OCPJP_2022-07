package Basic.IO_2.ex16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 *  ObjectOutputStream extends OutputStream
 *  ObjectOutputStream 對象的序列化流
 *  
 */
public class ex1 {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("/Users/blc0000421gmail.com/Desktop/io/j.txt"));
		oos.writeObject(new Person("John",18));
		oos.close();
	}
}
