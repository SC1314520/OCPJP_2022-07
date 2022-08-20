package Basic.IO_2.ex7;
/*
 * 遞迴：
 * 		當調用方法時，方法的主體不變，每次調用方法的參數不同，可以使用遞歸。
 * 注意：
 * 		不可以太多次，且必須有停止條件。
 * 		建構子禁止遞迴！！
 */
public class ex1 {
	public static void main(String[] args) {
		a();
	}
	private static void a() {
		System.out.println("a方法");
		a();
	}
}
