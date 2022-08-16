package exam;

public class ex36 {
	private int sum;
	public int compute() {
		int x=0;
		while(x<3) {
			sum+=++x;
			/*
			 * sum=sum+++x;
			 * x=x+1;
			 * sum=sum+x;
			 * 
			 */
			System.out.println("x="+x+"\tsum="+sum);
		}
		return sum/4;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex36 t=new ex36();
		int sum=t.compute();
		sum=t.compute();
		System.out.print(sum);
		
		

	}

}
/*
Given:

public class Test {
	private int sum;
	public int compute() {
		int x=0;
		while(x<3) {
			sum+=++x; 
			第一次：
			0: 1 1
			1: 3 2
			2: 6 3
			第二次：
			0: 7 1
			1: 9 2
			2: 12 3
		}
		return sum/4;	第一次：6/4=1    第二次： 12/4=3
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		int sum=t.compute(); // 1   -- 第一次
		sum=t.compute(); // 3   -- 第二次
		System.out.print(sum);
	}
}

What is the output?

A) 6
B) 3
C) An exception is thrown at runtime
D) 9




ans:B



*/

