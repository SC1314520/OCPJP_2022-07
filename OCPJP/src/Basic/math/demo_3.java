package Basic.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class demo_3 {
	public static void main(String[] args) {
		int[] x= {12,24,16,28,34,56,22,14,13,13,24,5,6,19,18};
		Arrays.sort(x);
		System.out.println(Arrays.toString(x)); // 輸出（由小至大）：[5, 6, 12, 13, 13, 14, 16, 18, 19, 22, 24, 24, 28, 34, 56]
		
		List<Integer> y =new ArrayList<>();
		for(int i:x) {
			y.add(i);
		}
		Collections.reverse(y);
		System.out.println(y); // 輸出（由大至小）： [56, 34, 28, 24, 24, 22, 19, 18, 16, 14, 13, 13, 12, 6, 5]
	}
}
