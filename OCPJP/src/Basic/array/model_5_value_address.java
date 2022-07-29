package Basic.array;

public class model_5_value_address {
	public static void main(String[] args) {
		int[] x =new int[] {10,20,30};
		int[] y =new int[] {40,50,60};
		System.out.println(x); // [I@1dbd16a6
		System.out.println(y); // [I@7ad041f3
		System.out.println(x[0]); //10
		System.out.println(y[0]); //40
		x=y; //位址＝位址 pass by address --> 消滅 --> 回收記憶體 --> garbage collection --> gc
		// x[0]=y[0] 值＝值 pass by values (copy) 
		System.out.println(x); // [I@7ad041f3
		System.out.println(y); // [I@7ad041f3
		// 兩者已指向同一個記憶體位置（視為一體）。
		System.out.println(x[0]); // 40
		System.out.println(y[0]); //40
		x[0]=100; // 其中一個改變，另一個跟著改變！！
		System.out.println(x[0]); //100
		System.out.println(y[0]); //100
		
		//--------------------------------//
		int i=10;
		int j=30;
		System.out.println(i); //10
		System.out.println(j); //30
		i=j; // pass by values
		System.out.println(i); //30
		System.out.println(j); //30
		j=40; // 其中一個改變，另一個不會跟著改變！！
		System.out.println(i); //30
		System.out.println(j); //40
	}
}
