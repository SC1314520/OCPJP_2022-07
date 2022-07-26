package Basic.while_loop;

public class model_1 {
	public static void main(String[] args) {
		//while loop --> The while loop loops through a block of code as long as a specified condition is true
		int i = 0;
		while (i < 5) {
		  System.out.println(i); // 輸出：0,1,2,3,4
		  i++;
		}
		
		// do-while loop --> This loop will execute the code block once, before checking if the condition is true
		int j = 0;
		do { 
		  System.out.println(j); // 輸出：0,1,2,3,4
		  j++;
		}
		while (j < 5);
		// while(true) 無窮迴圈
		int k=0;
		while(true) {
			if(k==10) {
				System.out.println("結束迴圈I");
				break;
			}
			else {
				k++;
			}
		}
		// do-while(true) 無窮迴圈
		int l=0;
		do {
			if(l==10) {
				System.out.println("結束迴圈II");
				break;
			}
			else {
				l++;
			}
		}while(true);
	}
}
