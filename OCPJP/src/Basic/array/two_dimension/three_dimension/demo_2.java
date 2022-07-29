package Basic.array.two_dimension.three_dimension;

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
	}
}
