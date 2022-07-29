package Basic.array.two_dimension;

import java.util.Arrays;

/*
 * 二維陣列：
 * 		1. It is implemented as an array of the specified element type.	(V)
 * 		2. All methods of the class Object may be invoked on the two-dimensional array.(V)
 * 		3. At declaration time, the number of elements of the array in each dimension must be specified. (X)
 * 		4. Using a row by column convention, each row of a two-dimensional array must be the same size. (X)
 */
public class demo_1 { // 二維陣列
	public static void main(String[] args) {
		// 針對第三點：我們可以這樣宣告
		int[][] num =new int[2][]; //後者可先不指定。-->用於後者不等長度的陣列。
		// 針對第四點：我們可以這樣宣告
		int[][] nums=new int[2][3]; //二維陣列可以不對稱。 --> 說明:(樹狀圖)先分兩條，再分三條。
		
		// 樹狀圖證明
		System.out.println(nums.length);// 2 --> 先分兩條
		System.out.println(nums[0].length); // 3  --> 再分三條
		//System.out.println(nums[0][0].length); --> 不可以這樣寫，因為這是數值。
		// 另類宣告法
		int[][] nums2 =new int[][] {{1,2,3},{4,5,6}}; //等同於 [2][3]
		int[][] nums3 = {{1,2,3},{4,5,6}}; // 這樣也可以
		
		// 傳值與傳址
		System.out.println(nums); // 二維記憶體位址: [[I@7d6f77cc
		System.out.println(nums[0]); // 一維記憶體位址: [I@5aaa6d82
		System.out.println(nums[0][0]); // 輸出 int 預設值: 0
		
		// 印出陣列
		System.out.println(Arrays.toString(nums2)); // 輸出:  [[I@73a28541, [I@6f75e721] 
		System.out.println(Arrays.toString(nums2[0])); //輸出: [1, 2, 3]
		
		// for 迴圈
		for(int[] i:nums2) {
			System.out.println(Arrays.toString(i)); // 輸出: [1, 2, 3] , [4, 5, 6]
		}
		for(int i=0;i<nums2.length;i++) {
			System.out.println(Arrays.toString(nums2[i])); // 輸出: [1, 2, 3] , [4, 5, 6]
		}
		
		// for 迴圈拆解元素
		for(int i=0;i<nums2.length;i++) {
			for(int j=0;j<nums2[i].length;j++) {
				System.out.println(nums2[i][j]); // 輸出: 1,2,3,4,5,6
			}
		}
		for(int[] i:nums2) {
			for(int j :i) {
				System.out.println(j); // 輸出: 1,2,3,4,5,6
			}
		}
	}
}
