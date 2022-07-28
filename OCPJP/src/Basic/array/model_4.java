package Basic.array;
/*
 * 二維陣列：
 * 		1. It is implemented as an array of the specified element type.	(V)
 * 		2. All methods of the class Object may be invoked on the two-dimensional array.(V)
 * 		3. At declaration time, the number of elements of the array in each dimension must be specified. (X)
 * 		4. Using a row by column convention, each row of a two-dimensional array must be the same size. (X)
 */
public class model_4 { // 二維陣列
	public static void main(String[] args) {
		// 針對第三點：我們可以這樣宣告
		int[][] num =new int[2][]; //後者可先不指定。
		// 針對第四點：我們可以這樣宣告
		int[][] nums=new int[2][3]; //二維陣列可以不對稱。
	}
}
