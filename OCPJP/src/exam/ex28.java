package exam;

public class ex28 {
	public static void main(String... hammer)
	{
		try{
			throw new ClassCastException(); // 會執行
		}catch(IllegalArgumentException e){ // 不會執行
			//throw new IllegalArgumentException();
			System.out.println(1);
		}catch(RuntimeException e){ // 會執行
			//throw new NullPointerException();
			System.out.println(2);
		}finally{
			throw new RuntimeException(); // 會執行
		}
	// Exception in thread "main" java.lang.RuntimeException   --> 以最後一個中斷為主！！
	}
}
/*
Given the following application, which specific type of exception will be printed in the stack trace at runtime?

package carnival;
public class WhackAnException{
	public static void main(String... hammer)
	{
		try{
			throw new ClassCastException();
		}catch(IllegalArgumentException e){
			throw new IlleaglArgumentException();
		}catch(RuntimeException e){
			throw new NullPointerException();
		}finally{
			throw new RuntimeException();
		}
	
	}

}

A. ClassCastException
B. IllegalArgumentException
C. NullPointerException
D. RuntimeException
E. The code does not compile.
F. None of the above




ans:D



*/