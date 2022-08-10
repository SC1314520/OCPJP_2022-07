package exam;

public class ex9 {
	public static void main(String[] args) {
		// while,for的雙層迴圈
		int i=10;
		do { // 先做一次再判斷
			for(int j=i/2;j>0;j--){  // (int j=5;j>0;j--) --> j=5,4,3,2,1
				System.out.print(j+" "); 
			}
			i-=2; // i= 10,8,6,4,2
		}while(i>0);
		
		// 輸出：5 4 3 2 1  4 3 2 1  3 2 1  2 1  1 
		
	}
}