package Basic.lambda_2.supplier;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class ex {
	public static void main(String[] args) {
		Supplier<member> s=new Supplier<member>() {
			
			@Override
			public member get() {
				
				return new member();
			}
		};
		
		System.out.println(s.get()); // Basic.lambda_2.supplier.member@4eec7777
		
		
		Supplier<member> s2 =()-> new member();
		System.out.println(s2.get()); // Basic.lambda_2.supplier.member@404b9385
		
		
		BooleanSupplier b =new BooleanSupplier() {
			
			@Override
			public boolean getAsBoolean() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		IntSupplier i=new IntSupplier() {
			
			@Override
			public int getAsInt() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		DoubleSupplier d =new DoubleSupplier() {
			
			@Override
			public double getAsDouble() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		
	}
}
class member{
	
}