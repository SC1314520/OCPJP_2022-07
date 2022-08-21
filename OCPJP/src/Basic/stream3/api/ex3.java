package Basic.stream3.api;

import java.util.Arrays;
import java.util.List;

public class ex3 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,5,6);
		
		int sum=0;
		for(int x:list) {
			sum+=x;
		}
		System.out.println(sum); // 17

		int sum2= list.stream().reduce(0,(a,b)->a+b);  
		System.out.println(sum2); // 17
	}
}
