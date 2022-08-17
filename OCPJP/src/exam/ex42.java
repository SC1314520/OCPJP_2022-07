package exam;

public class ex42 {

}
/*
What is the output of the following application?
package lot;
import java.util.function.*;

public class Warehouse {
	private int quantity=40;
	private final BooleanSupplier stock;  --> 只有 getAsBoolean();
	{
		stock=()->quantity>0;	
	}
	
	public void checkInventory() {
		if(stock.get()) // stock 裡面沒有 get() 方法 --> compile error!!
			System.out.print("Plenty!");
		else {
		   System.out.print("On Backorder!");
		}	
	}
	
	
	public static void main(String... widget) {
		final Warehouse w13=new Warehouse();
		w13.checkInventory();	
	}
}


A. Plenty
B. On Backorder!
C. The code does not compile because of the checkInventory() method.
D. The code does not compile for a different reason



ans:C
*/