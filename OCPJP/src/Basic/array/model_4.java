package Basic.array;

import java.util.Arrays;

import Basic.array.method.model_4_method;

public class model_4 { // model_4_method 內建 toString（）方法
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		model_4_method md=new model_4_method(num);
		md.length();
		System.out.println(num); // hashcode位置：[I@7ad041f3
		System.out.println(md.num); // hashcode位置：[I@7ad041f3
		System.out.println(md.num.toString()); // hashcode位置：[I@7ad041f3
		System.out.println(Arrays.toString(md.num)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(md); // 預設呼叫 toString() 方法 --> model_4_method [num=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]]
		System.out.println(md.toString()); //自行呼叫 toString() 方法 --> model_4_method [num=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]]
	}
}
