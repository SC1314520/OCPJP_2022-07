package Basic.exception.second;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  Exception: 編譯期異常，進行編譯（寫代碼）程序出現的問題。
 *  	RuntimeException:運行期異常，程序運行過程中出現的問題。
 *  			相當於程序有個小毛病，把異常處理掉，即可繼續執行。
 *  
 *  Error: 錯誤
 *  	錯誤相當於程序出現了一個無法治癒的毛病，必須修改代碼才可繼續執行。
 */
public class ex1 {
	public static void main(String[] args) /* throws ParseException */ {
		// Exception
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = sdf.parse("1999-0909");
			System.out.println(date);
		} catch (ParseException e) {
			System.out.println(e); // java.text.ParseException: Unparseable date: "1999-0909"
		}
		
		
		// RuntimeException
		int[] arr= {1,2,3}; 
		try {
			System.out.println(arr[3]); //java.lang.ArrayIndexOutOfBoundsException
		
		} catch (Exception e) {
			
			System.out.println(e);  //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		
		}
		
		// Error -->必須修改代碼才能執行
		//int[] arr2 =new int[1024*1024*1024]; // 陣列過大java.lang.OutOfMemoryError: Java heap space
		System.out.println("continue");
		
	}
}
