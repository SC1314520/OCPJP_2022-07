package Basic.string;

public class stringBuilder {
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
		
		//---------------------------------------------------------------//
		StringBuilder s=new StringBuilder("A dog is so cute!");
		StringBuilder s2=new StringBuilder("A dog is so cute!");
		StringBuilder s2_2=new StringBuilder("A dog is so cute!");
		StringBuilder s3=new StringBuilder("A dog is so cute!");
		StringBuilder s3_2=new StringBuilder("A dog is so cute!");
		StringBuilder s3_3=new StringBuilder("A dog is so cute!");
		//------------------StringBuilder insert() ----------------------//
		s.insert(1, " big"); // insert(int offset, String str) --> Inserts the string into this character sequence.
		System.out.println(s); // A big dog is so cute!
		
		//------------------StringBuilder replace() ----------------------//
		s2.replace(2, 5, "cat");
		System.out.println(s2); //A cat is so cute!
		s2_2.replace(2, 4, "cat");
		System.out.println(s2_2); // A catg is so cute!  (說明不包含 EndIndex本身）
		
		//------------------StringBuilder delete() ----------------------//
		s3.delete(2, 5);
		System.out.println(s3); // A  is so cute!
		s3_2.delete(2, 4);
		System.out.println(s3_2); // A g is so cute! (說明不包含 EndIndex本身）
		s3_3.deleteCharAt(2);
		System.out.println(s3_3); // A og is so cute! (刪除 index 所在之字元。）
		
		//------------------StringBuilder subString() ----------------------//
		StringBuilder s4=new StringBuilder("A dog is so cute!");
		System.out.println(s4.substring(2)); //dog is so cute!
		System.out.println(s4.substring(2, s4.length())); //dog is so cute!
	}
}
