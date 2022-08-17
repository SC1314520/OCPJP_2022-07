package Basic.lambda.ex2;
/*
 *  日誌案例
 *  
 *  發現以下代碼存在一些性能浪費的問題：
 *  	調用 showLog方法，傳遞的第二個參數是拼接後的字串
 *  	先把字串拼接好，然後再調用 showLog 方法，
 *  	若 level 不等於 1 ，則不會執行輸出，存在浪費。
 */
public class ex {
	public static void showLog(int level,String message) {
		// 對日誌等級進行判斷
		if(level==1) {
			System.out.println(message);
		}
	}
	public static void main(String[] args) {
		String msg1="Hello";
		String msg2=" World";
		String msg3=" Java";
		
		showLog(1, msg1+msg2+msg3);
	}
}
