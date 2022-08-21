package solve;

// ch3 ex13
/*
 * 		1. 只能存放值
 * 		2. 本身與內容皆具有： public static final
 * 		3. 可稱作沒有名字的陣列：  Values() --> 轉陣列
 * 		4. 可搭配建構子 --> 須設定 private
 */
public class enum_problem {
	public static void main(String[] args) {
		System.out.println(Alphabet.getFirstLetter());
	}
}


enum Alphabet{
	A,B,C ;
	
	
	public static String getFirstLetter() {
		return A.toString();
		// return A  --> 為 Alphabet 型態，故須 toString();
	}
	
}