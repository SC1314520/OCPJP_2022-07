package Basic.array.Arrays_api;

import java.util.Arrays;

public class ex2 { //陣列升序 倒序
	public static void main(String[] args) {
		String str ="acdebfwqwdsadadcwrq";
		
		char[] chars =str.toCharArray();
		
		// 升序
		Arrays.sort(chars);
		System.out.println(chars); //aaabccddddefqqrswww
		
		// 倒序
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]); // wwwsrqqfeddddccbaaa
		}
	}
}
