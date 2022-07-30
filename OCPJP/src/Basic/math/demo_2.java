package Basic.math;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class demo_2 {
	public static void main(String[] args) {
		// 陣列作法 -->取最大值
		int[] x= {12,24,16,28,34,56,22,14,13};
		int max=x[0];
		for(int j:x) {
			if(j>max) {
				max=j;
			}
			else {
				continue;
			}
		}
		// 陣列作法 -->取最小值
		int min=x[0];
		for(int j:x) {
			if(j<min) {
				min=j;
			}
			else {
				continue;
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		//----------------------------------------//
		//集合作法
		List<Integer> y=new ArrayList<>();
		for(int j:x) {
			y.add(j);
		}
		int max2=Collections.max(y);
		int min2 =Collections.min(y);
		System.out.println(max2);
		System.out.println(min2);
	}
}
