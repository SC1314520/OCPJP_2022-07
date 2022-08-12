package Basic.exception.second;

/*
 * throw:
 * 	1. throw 必須寫在方法內部
 * 	2. throw 後面new的對象必須是 Exception 或 Exception 的子類別。
 * 	3. 若創建的是 RuntimeException 或其類別，則可以默認不處理，交給JVM處理。
 * 	4. 若為編譯異常，則需 throws or try-catch
 * 
 */
public class ex2 {
	public static void main(String[] args) {
		//int[] arr= null;
		int[] arr= new int[3];
		int e = getElement(arr, 0); // java.lang.NullPointerException: 傳遞的陣列為空
		System.out.println(e);
		
		int x = getElement(arr, 3); // java.lang.ArrayIndexOutOfBoundsException: 超出陣列範圍
	}
	
	public static int getElement(int[] arr , int index) {
		if(arr==null) {
			// RuntimeException 運行期異常 --> 可默認交給JVM處理。
			throw new NullPointerException("傳遞的陣列為空");
		}
		if(index<0 || index>arr.length-1) {
			throw new ArrayIndexOutOfBoundsException("超出陣列範圍");
		}
		
		int ele =arr[index];
		return ele;
	}
}
