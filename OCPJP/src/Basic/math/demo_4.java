package Basic.math;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class demo_4 { // 亂數
	public static void main(String[] args) {
		//------------------- java.lang.Math ----------------------//
		int[] x=new int[10];
		for(int i=0;i<x.length;i++) {
			x[i]=(int)(Math.random()*100+1); // 1~100 (不包含 100)
		}
		Arrays.sort(x); // 由小排到大
		System.out.println(Arrays.toString(x)); //[6, 15, 29, 44, 51, 52, 68, 69, 87, 96]
		
		//------------------- java.util.Random ----------------------//
		int[] y=new int[10];
		for(int i=0;i<y.length;i++) {
			y[i]=new Random().nextInt(100)+1; // 1~100 (不包含 100)
		}
		Arrays.sort(y); // 由小排到大
		System.out.println(Arrays.toString(y)); //[1, 9, 21, 28, 34, 39, 40, 69, 89, 98]
		
		// another method
		DecimalFormat df =new DecimalFormat("#.##"); //取到小數第二位。
		double i=new Random().nextDouble(); // 產生 0.0~1.0 之間的數值
		System.out.println(df.format(i)); 
		
		boolean j =new Random().nextBoolean(); // 產生 true/false
		System.out.println(j);
	}
}
