package Basic.array;

import java.util.Arrays;

public class model_2 {
	public static void main(String[] args) {
		
		// 基本型別
		int[] array=new int[3];
		double[] arrays =new double[3];
		boolean[] arrays2 = new boolean[3];
		// 包覆類別: class 的預設值皆是 null
		String[] arrays3 =new String[3];
		Integer[] arrays4 =new Integer[3];
		Boolean[] arrays5 =new Boolean[3];
		
		System.out.println(array[0]); // 0
		System.out.println(arrays[0]); // 0.0
		System.out.println(arrays2[0]); //false
		System.out.println(arrays3[0]); //null
		System.out.println(arrays4[0]); //null
		System.out.println(arrays5[0]); //null
		
		//--------------------------------------//
		int[] s= {1,2,3};
		System.out.println(s); //產生hashcode位置
		System.out.println(s.toString());//產生hashcode位置
		System.out.println(Arrays.toString(s)); // 輸出:[1,2,3]
	}
}
