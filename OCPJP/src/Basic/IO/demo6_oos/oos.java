package Basic.IO.demo6_oos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class oos {
	public static void main(String[] args) throws IOException{
		
		FileOutputStream fos =new FileOutputStream("/Users/blc0000421gmail.com/Desktop/io/student.txt");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		
		oos.writeObject(new student("John",70, 80));
		oos.writeObject(new student("John2",71, 81));
		oos.writeObject(new student("John3",72, 82));
		oos.writeObject(new student("John4",73, 83));
	}
}
