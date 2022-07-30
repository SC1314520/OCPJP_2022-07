package Basic.math;

import java.util.Arrays;
import java.util.Collections;

public class demo_3 {
	public static void main(String[] args) {
		int[] x= {12,24,16,28,34,56,22,14,13,13,24,5,6,19,18};
		Arrays.sort(x);
		System.out.println(Arrays.toString(x)); // 輸出（由小至大）：[5, 6, 12, 13, 13, 14, 16, 18, 19, 22, 24, 24, 28, 34, 56]
	}
}
