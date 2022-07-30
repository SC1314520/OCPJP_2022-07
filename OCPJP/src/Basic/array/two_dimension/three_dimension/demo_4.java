package Basic.array.two_dimension.three_dimension;

import java.util.Arrays;

public class demo_4 { //不對稱三維陣列
	public static void main(String[] args) {
		// 可宣告方式
		int[][][] x= new int[2][2][];
		int[][][] y =new int[2][][];
		// 另類寫法
		int[][][] z= {{{1,2,3},{4,5,6}},{{7,7,7},{8,8,8}}}; // [2][2][3] 對稱
		int[][][] z1={{{1,2,3},{4,5}},{{6,7},{8,9,10}}};// [2][2][] 不對稱
		int[][][] z2={{{1,2,3},{4,5},{6}},{{7,8,9},{10}}}; // [2][][] 不對稱
		// for 迴圈
		for(int[][] i:z2) {
			System.out.println(Arrays.toString(i)); // [[I@1dbd16a6, [I@7ad041f3, [I@251a69d7] ; [[I@7344699f, [I@6b95977]
			for(int[] j:i) {
				System.out.println(Arrays.toString(j));// [1,2,3] , [4,5] , [6] ; [7,8,9] , [10]
				for(int k:j) {
					System.out.println(k); // 輸出：1,2,3,4,5,6,7,8,9,10
				}
			}
		}
		for(int i=0; i<z1.length;i++) {
			for(int j=0;j<z1[i].length;j++) {
				for(int k=0;k<z1[i][j].length;k++) {
					System.out.println(z1[i][j][k]); // 輸出：1,2,3,4,5,6,7,8,9,10
				}
			}
		}
		
	}
}
