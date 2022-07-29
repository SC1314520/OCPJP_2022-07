package Basic.array.two_dimension.three_dimension;

import java.util.Arrays;

public class demo_2 {
	public static void main(String[] args) {
		//可以這樣宣告 new int [2][][]
		//或這樣宣告 new int [2][2][]
		int[][][] x =new int [2][2][3];
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				for(int k=0;k<x[i][j].length;k++) {
					System.out.println(x[i][j][k]);
				}
			}
		}
		for(int[][] i:x) {
			for(int[] j:i) {
				for(int k:j) {
					System.out.println(k);
				}
			}
		}
		//---------------------------------------------//
		int[][][] y = {{{1,2,3},{4,5,6}},{{8,8,8},{9,9,9}}};
		System.out.println(Arrays.toString(y)); // [[[I@7d6f77cc, [[I@5aaa6d82]
		for(int[][] i:y) {
			System.out.println(Arrays.toString(i)); //[[I@73a28541, [I@6f75e721]
			for(int[] j:i) {
				System.out.println(Arrays.toString(j)); //[1, 2, 3],[4, 5, 6]
				for(int k:j) {
					System.out.println(k); //1,2,3,4,5,6
				}
			}
		}
	}
}
