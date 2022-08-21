package solve;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Random;

public class exception_problem {
	public static void main(String[] args) throws Exception {
		doA();
	}
	
	
	
	public static void doA()   {
		int x=new Random().nextInt(10);
		if(x%2==0) {
			throw new RuntimeException(); // 非檢查性異常（unchecked) 可以不處理。 --> 繼承或使用的類別可以無需拋出例外
		}
		else {
			//throw new Exception(); // 檢查性異常（checked) 須拋出例外！！
		}
		
	}
}
/*  java.lang
常用 unchecked

ArithmeticException

ArrayIndexOutOfBoundsException

ClassCastException

IndexOutOfBoundsException

NullPointerException

NumberFormatException

StringIndexOutOfBoundsException

NoSuchElementException

常用 checked

ClassNotFoundException

NoSuchFieldException

NoSuchMethodException

FileNotFoundException

IOException

EOFException

*/




/*






*/