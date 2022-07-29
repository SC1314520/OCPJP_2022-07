package Basic.array.two_dimension;

public class demo_3 { //不對稱陣列
	public static void main(String[] args) { 
		int[][] x =new int[2][];
		x[0]=new int[3];
		x[1]=new int[4];
		for(int[] i : x) {
			System.out.println("length:"+i.length);
			System.out.print("元素:");
			for(int j:i) {
				System.out.print(j); 
			}
			System.out.println();
		}
		// 輸出結果: length:3, 元素:0 0 0  |  length:4, 元素:0 0 0 0 
		
		//------------------------------------------//
		int[][] y = {{1,2,3},{4,5}};
		for(int[] i : y) {
			System.out.println("length:"+i.length);
			System.out.print("元素:");
			for(int j:i) {
				System.out.print(j); 
			}
			System.out.println();
		}
		// 輸出結果: length:3, 元素:1 2 3  |  length:2, 元素:4 5
	}
}
