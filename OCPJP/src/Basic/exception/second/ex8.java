package Basic.exception.second;

import java.util.List;

public class ex8 {
	public static void main(String[] args) {
	
		try {
			
			int[] arr ={1,2,3};
			System.out.println(arr[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e); // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		}
		
		try {
			
			List<Integer> list =List.of(1,2,3);
			System.out.println(list.get(3));
			
		} catch (IndexOutOfBoundsException e) {
			
			System.out.println(e); // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		}
	
		
		// ------------------------------------------------------------------------------------------  //
		
		/*
		 *   一個 try 多個 catch 注意事項：
		 * 		catch 裡面定義異常變涼，若有子父類別關係，子類必須寫在前面！！
		 * 		ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
		 */
		try {
			int[] arr ={1,2,3};
			System.out.println(arr[3]);
			
			List<Integer> list =List.of(1,2,3);
			System.out.println(list.get(3));
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
			
		} catch (IndexOutOfBoundsException e) {
			
			System.out.println(e);
			
		}
		System.out.println("後續代碼");
		
	
	
	
		/*
		 *   多個異常一次處理
		 */
		try {
		int[] arr ={1,2,3};
		System.out.println(arr[3]);
		
		List<Integer> list =List.of(1,2,3);
		System.out.println(list.get(3));
		
		} catch (Exception e) {
		
		System.out.println(e);
		
		}
	
	}
}

