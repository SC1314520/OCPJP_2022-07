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
		
		//------------------String length() ----------------------//
		String lt ="A dog comes from your home,and your dog is so cute!";
		System.out.println(lt.length()); //輸出 51 --> 字串長度(含空格）
		
		//------------------String indexOf() ----------------------//
		// char
		System.out.println(lt.indexOf("A")); //輸出 0 //第一項 index=0 -->Returns the index within this string of the first occurrence of the specified character.
		System.out.println(lt.indexOf("d")); //輸出 2  -->Returns the index within this string of the first occurrence of the specified character.
		System.out.println(lt.indexOf("o")); //輸出 3 -->Returns the index within this string of the first occurrence of the specified character.
		System.out.println(lt.indexOf("o",2)); // 輸出 3 -->Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
		System.out.println(lt.indexOf("o",3)); // 輸出 3 (說明 fromIndex 包含判斷本身）
		// subString
		System.out.println(lt.indexOf("dog")); //輸出 2 -->Returns the index within this string of the first occurrence of the specified substring.
		System.out.println(lt.indexOf("dog",3)); //輸出 36 //從 index=3 以後，開始找尋完整段落。 //indexOf(String str, int fromIndex) --> Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
		
		//------------------String charAt() ----------------------//
		System.out.println(lt.charAt(0)); // 輸出 A 
		System.out.println(lt.charAt(1)); // 輸出 " "
		
		//------------------String startsWith()  -->boolean ----------------------// 
		
		System.out.println(lt.startsWith("A")); // 輸出 true --> Tests if this string starts with the specified prefix.
		System.out.println(lt.startsWith("c")); // 輸出 false --> Tests if this string starts with the specified prefix.
		
		// startsWith(String prefix, int toffset) --> Tests if the substring of this string beginning at the specified index starts with the specified prefix.
		System.out.println(lt.startsWith("A", 0));  // 輸出 true
		System.out.println(lt.startsWith("A", 1));  // 輸出 false
		System.out.println(lt.startsWith("d", 2));  // 輸出 true
		
		//------------------String endsWith() --> boolean ----------------------//
		System.out.println(lt.endsWith("!")); // 輸出 true --> Tests if this string ends with the specified suffix.
		System.out.println(lt.endsWith("e")); // 輸出 false --> Tests if this string ends with the specified suffix.
			
		//------------------String trim() ----------------------//
		String tr =" sss ";
		tr.trim();
		System.out.println(tr); // 輸出： " sss "
		System.out.println(tr.length()); //輸出：5
		tr=tr.trim();
		System.out.println(tr); // 輸出： "sss"
		System.out.println(tr.length()); //輸出：3
		
		//------------------String subString() ----------------------// Returns a string that is a substring of this string.
		String sb="A cat is so cute!";
		//substring(int beginIndex)
		System.out.println(sb.substring(2)); // 輸出： cat is so cute!
		System.out.println(sb.substring(3)); // 輸出： at is so cute!
		//substring(int beginIndex, int endIndex)
		System.out.println(sb.substring(2,4)); // 輸出：ca （說明不包含 endIndex 本身）
		System.out.println(sb.substring(2,5)); // 輸出：cat 
		
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
		//------------------String equalsIgnoreCase() ----------------------//
		String ei1="dog";
		String ei2="Dog";
		System.out.println(ei1.equals(ei2)); // false
		System.out.println(ei1.equalsIgnoreCase(ei2)); // true --> 無視大小寫差別
		//------------------String toLowerCase() ----------------------//
		String lc ="ABCdefGhIj";
		System.out.println(lc.toLowerCase()); // 輸出：abcdefghij
		//------------------String toUpperCase() ----------------------//
		System.out.println(lc.toUpperCase()); // 輸出：ABCDEFGHIJ
		
		
	}
}
