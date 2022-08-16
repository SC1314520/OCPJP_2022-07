package exam;

public class ex29 {

}
/*
Given the following application, what is the name of the class printed at line e1?

package canyon;
final class FallenException extends Exception{}
final class HikingGear implements AutoCloseable{
	@Override public void close() throws Exception{
		throw new FallenException();
	}
}

public class Cliff{
	public final void climb() throws Exception{
		try(HikingGear gear=new HikingGear() //  --> 如果{}中程式出現錯誤，則()會自動關閉而不會執行～～){
			throw new RuntimeException(); // -->中斷
		}	
	}
	public static void main(String... rocks){
		try{
			new Cliff().climb();		
		}catch(Throwable t){
			System.out.println(t); //e1
		}	
	}
}


A. canyon.fallenException
B. java.lang.RuntimeException
C. The code does not compile.
D. The code compile, but the answer cannot be determined until runtime.
E. None of the above


ans:B


*/