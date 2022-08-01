package Basic.array.two_dimension.three_dimension;

public class demo_5 { // 三維陣列拆解
	public static void main(String[] args) {
		int[][][] x =new int[2][][];
		x[0]=new int[2][];
		x[0][0]=new int[2];
		x[0][1]=new int[3];
		
		x[1]=new int[3][];
		x[1][0]=new int[2];
		x[1][1]=new int[3];
		x[1][2]=new int[4];
		
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
