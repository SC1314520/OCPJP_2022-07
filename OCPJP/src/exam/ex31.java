package exam;

import java.io.FileReader;
import java.io.IOException;

public class ex31 {
	public static void main(String[] args) {
		char[] characters=new char[100];
		   try(FileReader reader=new FileReader("file_to_path");) //  --> 如果{}中程式出現錯誤，則()會自動關閉而不會執行～～
		   {
			  reader.read(characters);// int 型態 --> 將文件讀入 characters  --> read(char[] cbuf) --> Reads characters into an array.
			  System.out.println(String.valueOf(characters));
			  
		   } catch(IOException e){
			  e.printStackTrace();	
			}
	}
}
/*
Given:

   char[] characters=new char[100];
   try(FileReader reader=new FileReader("file_to_path");){
	// line 1
	  System.out.println(String.valueOf(characters));
	} catch(IOException e){
	  e.printStackTrace();	
	}

	You want to read data through the reader object.
	
	Which statement inserted on line 1 will accomplish this?
	
	A) reader.readLine();
	B) characters=reader.read();
	C) reader.read(characters);
	D) characters.read();
	
	
	ans:C


*/