package Basic.string;

public class string {
	public static void main(String[] args) {
		StringBuilder str =new StringBuilder();   //  --> StringBuilder() 初始容量為 16 字元
		StringBuilder str1 =new StringBuilder(5); //   --> StringBuilder(int capacity) 自訂初始容量 // build with no character
		System.out.println(str1); // 輸出為空白  
		StringBuilder str2 =new StringBuilder("5"); // --> StringBuilder(String str)
		System.out.println(str2); // 輸出為 5
		
		//------------------StringBuilder append() ----------------------//
		StringBuilder test =new StringBuilder("A");
		test.append("B");
		System.out.println(test); // 輸出 AB
		test.append("C");
		System.out.println(test); // 輸出 ABC
		
		//------------------String concat() ----------------------//
		String x= "X";
		x.concat("Y");
		System.out.println(x); // 輸出 X
		x=x.concat("Y"); 
		System.out.println(x); // 輸出 XY
		x=x.concat("Z"); 
		System.out.println(x); // 輸出 XYZ
		
		//------------------String trim() ----------------------//
		String tr =" sss ";
		tr.trim();
		System.out.println(tr); // 輸出： " sss "
		System.out.println(tr.length()); //輸出：5
		tr=tr.trim();
		System.out.println(tr); // 輸出： "sss"
		System.out.println(tr.length()); //輸出：3
		
		//------------------String replace() ----------------------//
		// replace(char oldChar, char newChar)
		String rp ="A";
		rp.replace("A","B");
		System.out.println(rp); // 輸出：A
		rp=rp.replace("A","B");
		System.out.println(rp); // 輸出：B
		
		//------------------String replaceAll() ----------------------//
		//replaceAll(String regex, String replacement)
		String rA="We are family";
		rA=rA.replaceAll("family", "valentines");
		System.out.println(rA); // 輸出：We are valentines
		
		//------------------String repeat() ----------------------//
		String rt=" We are family";
		rt=rt.repeat(2); // 重複兩次
		System.out.println(rt); //輸出： We are family We are family
		
	}
}
