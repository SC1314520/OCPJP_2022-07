package exam;

public class ex2 {
	public static void main(String[] args) {
		new Airplane(10).fly(5);
		

	}
	
	
}

class Airplane{
	static int start=2;  
	final int end;
	public Airplane(int x)
	{
		x=4;
		end=x; // end = 4
	}
	
	public void fly(int distance)
	{
		System.out.print(end-start+" "); // 4-2=2
		System.out.print(distance);	 // 5
	}
	
	

}
