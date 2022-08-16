package exam;
/*
 *  Enum: Java 6 以上以前只可以存放 String ， Java 7 以後可以以物件方式儲存。
 * 		1. 只能存放值
 * 		2. 本身與內容皆具有： public static final
 * 		3. 可稱作沒有名字的陣列：  Values() --> 轉陣列
 * 		4. 可搭配建構子 --> 須設定 private
 */
enum Alphabet {
	A,B,C;  // 本身屬於 Alphabet
	
	public static String getFirstLetter() {
		return A.toString();
	}
}
public class ex22_i{
	public static void main(String[] args) {
		// 第一種寫法：
		System.out.println(Alphabet.getFirstLetter());
		
		// 第二種寫法：
		Alphabet[] x = Alphabet.values();
		System.out.println(x[0]);
	}
}

/*
Given the enum declaration:

1.enum Alphabet{
2.   A,B,C
3.
4.}

Example this code:
	System.out.println(Alphabet.getFirstLetter());

What code should be written at line 3 to make this code print A?

A) static String getFirstLetter() { return A.toString();}
B) static String getFirstLetter() { return Alphabet.values().toString();}
C) String getFirstLetter() { return A.toString();}
D) final String getFirstLetter() { return A.toString();}




ans:A



*/