package exam;

public class ex30 {

}
/*
Given:

import java.io.FileNotFoundException;
import java.io.IOException;

public class Tester{
	public static void main(String[] args){
		try{
			doA();
		}//line 1
	}
	private static void doA() throws Exception,IndexOutOfBoundsException{
		if(false){
			throw new FileNotFoundException();
		}else{
			throw now IndexOutOfBoundsException();
		}
	}
}

What must be added in line 1 to compile this class?

A) catch(FileNotFoundException | Exception e){}  // 要撰寫 throws 類別 --> Exception e // 有父子關係的話不可以這樣寫！！
B) catch(FileNotFoundException e){}  // 要撰寫 throws 類別 --> Exception e
   catch(IndexOutOfBoundsException e){}
C) catch(Exception e){}
D) catch(IndexOutOfBoundsEexception e){}
   catch(FileNotFoundException e){} // 要撰寫 throws 類別 --> Exception e

E) catch(FileNotFoundException | IndexOutBoundException e){} // 要撰寫 throws 類別 --> Exception e


ans:C


*/