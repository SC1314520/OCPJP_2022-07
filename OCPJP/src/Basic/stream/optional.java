package Basic.stream;

import java.util.Optional;

public class optional {
	public static void main(String[] args) {
		int[] x= {};
		System.out.println(avg(x)); // Optional.empty
		
		int[] y= {12,45,78,90};
		System.out.println(avg(y)); // Optional[56.25]
	}
	static  Optional <Double> avg(int... scores){ // int... 陣列
		// return 0.0; 
		
		if(scores.length==0) return Optional.empty();
		int sum=0;
		for(int score:scores) {
			sum+=score;
		}
		return Optional.of((double)sum/scores.length);
	}
}
